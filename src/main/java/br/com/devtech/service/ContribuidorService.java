package br.com.devtech.service;

import br.com.devtech.dtos.request.ContribuidorRequestDTO;
import br.com.devtech.dtos.response.ContribuidorResponseDTO;
import br.com.devtech.entity.ContribuidorEntity;
import br.com.devtech.exception.NotFoundException;
import br.com.devtech.repository.IContribuidorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor //gerando o construtor automaticamente pelo lombok.
public class ContribuidorService {

    private final IContribuidorRepository contribuidorRepository; //injeçao de dependencias no construtor.

    public ContribuidorResponseDTO create (ContribuidorRequestDTO dtoRequest) {
        ContribuidorEntity contribuidor = new ContribuidorEntity();
        contribuidor.setNome(dtoRequest.nome());
        contribuidor.setEmail(dtoRequest.email());
        contribuidor.setLinkGithub(dtoRequest.github());

        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return respostaDTO(salvo);
    }

    public ContribuidorResponseDTO update (Long id, ContribuidorRequestDTO dtoRequest ){

        try{
            ContribuidorEntity contribuidor = contribuidorRepository.getReferenceById(id);

            contribuidor.setNome(dtoRequest.nome());
            contribuidor.setEmail(dtoRequest.email());
            contribuidor.setLinkGithub(dtoRequest.github());

            ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
            return respostaDTO(salvo);

        } catch (NotFoundException ex){
            throw ex;
        } catch (Exception ex){
            throw new RuntimeException("Erro ao atualizar usuário", ex);
        }

    }

    private ContribuidorResponseDTO respostaDTO (ContribuidorEntity salvoContribuidor){
        return new ContribuidorResponseDTO(salvoContribuidor.getId(), salvoContribuidor.getNome(), salvoContribuidor.getLinkGithub());
    }
}
