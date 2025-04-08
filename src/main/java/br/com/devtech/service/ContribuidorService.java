package br.com.devtech.service;

import br.com.devtech.dtos.ContribuidorDTO;
import br.com.devtech.entity.ContribuidorEntity;
import br.com.devtech.repository.IContribuidorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<ContribuidorDTO> findAll(){
        List<ContribuidorEntity> contribuidores = contribuidorRepository.findAll();

        return contribuidores.stream() //cria uma sequência de dados que podemos processar com métodos funcionais.
                .map(valor -> new ContribuidorDTO(
                        /* Percorre cada ContribuidorEntity da lista e transforma ela
                         * em um novo objeto ContribuidorDTO,
                         * 'new ContribuidorDTO()' cria um novo DTO com os dados da entidade*/
                        valor.getNome(),
                        valor.getEmail(),
                        valor.getLinkGithub()
                ))
                .collect(Collectors.toList()); /* Essa parte transforma o Stream de DTOs em uma List<ContribuidorDTO>.
                                                * Ou seja, depois de mapear cada entidade, juntamos todos os resultados
                                                * numa lista final.*/
    }

    public ContribuidorDTO delete (Long id){
        ContribuidorEntity contribuidor = contribuidorRepository.getById(id);
        contribuidorRepository.delete(contribuidor);
        return respostaDTO(contribuidor);
    }

    private ContribuidorDTO respostaDTO (ContribuidorEntity salvoContribuidor){
        return new ContribuidorDTO(
                salvoContribuidor.getNome(),
                salvoContribuidor.getEmail(),
                salvoContribuidor.getLinkGithub()
        );
    }
}
