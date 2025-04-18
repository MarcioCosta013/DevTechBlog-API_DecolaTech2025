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
        contribuidor.setLinkGithub(dtoRequest.githubLink());

        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return new ContribuidorDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail(),
                salvo.getLinkGithub()
        );
    }

    public ContribuidorDTO update (Long id, ContribuidorDTO dtoRequest ){
        ContribuidorEntity contribuidor = contribuidorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contribuidor não encontrado"));

        contribuidor.setNome(dtoRequest.nome());
        contribuidor.setEmail(dtoRequest.email());
        contribuidor.setLinkGithub(dtoRequest.githubLink());

        ContribuidorEntity salvo = contribuidorRepository.save(contribuidor);
        return new ContribuidorDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail(),
                salvo.getLinkGithub()
        );
    }

    public ContribuidorDTO findById (Long id){
        ContribuidorEntity contribuidor = contribuidorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contribuidor não encontrado"));

        return new ContribuidorDTO(
                contribuidor.getId(),
                contribuidor.getNome(),
                contribuidor.getEmail(),
                contribuidor.getLinkGithub()
        );
    }

    public List<ContribuidorDTO> findAll(){
        List<ContribuidorEntity> contribuidores = contribuidorRepository.findAll();

        return contribuidores.stream() //cria uma sequência de dados que podemos processar com métodos funcionais.
                .map(valor -> new ContribuidorDTO(
                        /* Percorre cada ContribuidorEntity da lista e transforma ela
                         * em um novo objeto ContribuidorDTO,
                         * 'new ContribuidorDTO()' cria um novo DTO com os dados da entidade*/
                        valor.getId(),
                        valor.getNome(),
                        valor.getEmail(),
                        valor.getLinkGithub()
                ))
                .collect(Collectors.toList()); /* Essa parte transforma o Stream de DTOs em uma List<ContribuidorDTO>.
                                                * Ou seja, depois de mapear cada entidade, juntamos todos os resultados
                                                * em uma lista final.*/
    }

    public ContribuidorDTO delete (Long id){
        ContribuidorEntity contribuidor = contribuidorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contribuidor não encontrado"));

        contribuidorRepository.delete(contribuidor);
        return new ContribuidorDTO(
                contribuidor.getId(),
                contribuidor.getNome(),
                contribuidor.getEmail(),
                contribuidor.getLinkGithub()
        );
    }

}
