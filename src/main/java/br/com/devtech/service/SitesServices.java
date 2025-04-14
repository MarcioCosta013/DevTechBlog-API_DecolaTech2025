package br.com.devtech.service;

import br.com.devtech.dtos.ContribuidorDTO;
import br.com.devtech.dtos.SitesDTO;
import br.com.devtech.entity.ContribuidorEntity;
import br.com.devtech.entity.SitesEntity;
import br.com.devtech.repository.IContribuidorRepository;
import br.com.devtech.repository.ISitesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SitesServices {

    private final ISitesRepository sitesRepository;
    private final IContribuidorRepository contribuidorRepository;

    public SitesDTO createSite (SitesDTO dto){
        // Busca o contribuidor existente no banco pelo ID que vem do DTO
        Long contribuidorId = dto.contribuidor().id();
        ContribuidorEntity contribuidor = contribuidorRepository.findById(contribuidorId)
                .orElseThrow(() -> new RuntimeException("Contribuidor não encontrado"));

        // Criar a entidade do site e settar os dados
        SitesEntity sites = new SitesEntity();
        sites.setLinkSite(dto.linkSite());
        sites.setDescricao(dto.descricao());
        sites.setTitulo(dto.titulo());
        sites.setStack(dto.stack());
        sites.setContribuidor(contribuidor);

        SitesEntity salvo = sitesRepository.save(sites);
        return new SitesDTO(
                salvo.getTitulo(),
                salvo.getDescricao(),
                salvo.getLinkSite(),
                salvo.getStack(),
                new ContribuidorDTO(salvo.getContribuidor().getId(), null, null, null)
        );
    }

    public SitesDTO updateSites (Long id, SitesDTO dto){

        SitesEntity sites = sitesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Site não encontrado"));

        sites.setTitulo(dto.titulo());
        sites.setStack(dto.stack());
        sites.setLinkSite(dto.linkSite());
        sites.setDescricao(dto.descricao());

        SitesEntity salvo = sitesRepository.save(sites);
        return new SitesDTO(
                salvo.getTitulo(),
                salvo.getDescricao(),
                salvo.getLinkSite(),
                salvo.getStack(),
                new ContribuidorDTO(salvo.getContribuidor().getId(),null, null, null)
        );
    }

    public SitesDTO findByIdSite (Long id){
        SitesEntity site = sitesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Site não encontrado"));

        return new SitesDTO(
                site.getTitulo(),
                site.getDescricao(),
                site.getLinkSite(),
                site.getStack(),
                new ContribuidorDTO(site.getContribuidor().getId(),null, null, null)
        );
    }

    public List<SitesDTO> findAllSite(){
        List<SitesEntity> sites = sitesRepository.findAll();

        return sites.stream()
                .map( valor -> new SitesDTO(
                        valor.getTitulo(),
                        valor.getDescricao(),
                        valor.getLinkSite(),
                        valor.getStack(),
                        new ContribuidorDTO( valor.getContribuidor().getId(),null, null, null)
                ))
                .collect(Collectors.toList());
    }

    public SitesDTO deleteSite(Long id){
        SitesEntity site = sitesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Site não encontrado"));
        sitesRepository.delete(site);

        return new SitesDTO(
                site.getTitulo(),
                site.getDescricao(),
                site.getLinkSite(),
                site.getStack(),
                new ContribuidorDTO(site.getContribuidor().getId(),null, null, null)
        );
    }
}
