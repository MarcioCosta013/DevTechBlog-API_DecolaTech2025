package br.com.devtech.service;

import br.com.devtech.dtos.ContribuidorDTO;
import br.com.devtech.entity.ContribuidorEntity;
import br.com.devtech.repository.IContribuidorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor //gerando o construtor automaticamente pelo lombok.
public class ContribuidorService {

    private final IContribuidorRepository contribuidorRepository; //injeçao de dependencias no construtor.

    public ContribuidorDTO create (ContribuidorDTO dtoRequest) {
        ContribuidorEntity contribuidor = new ContribuidorEntity();
        contribuidor.setNome(dtoRequest.nome());
        contribuidor.setEmail(dtoRequest.email());
        contribuidor.setLinkGithub(dtoRequest.github());

        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return respostaDTO(salvo);
    }

    public ContribuidorDTO update (Long id, ContribuidorDTO dtoRequest ){
        ContribuidorEntity contribuidor = contribuidorRepository.getById(id);

        contribuidor.setNome(dtoRequest.nome());
        contribuidor.setEmail(dtoRequest.email());
        contribuidor.setLinkGithub(dtoRequest.github());

        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return respostaDTO(salvo);
    }

    public ContribuidorDTO findById (Long id){
        ContribuidorEntity contribuidor = contribuidorRepository.getById(id);
        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return respostaDTO(salvo);
    }

    private ContribuidorDTO respostaDTO (ContribuidorEntity salvoContribuidor){
        return new ContribuidorDTO(
                salvoContribuidor.getId(),
                salvoContribuidor.getNome(),
                salvoContribuidor.getEmail(),
                salvoContribuidor.getLinkGithub()
        );
    }
}
