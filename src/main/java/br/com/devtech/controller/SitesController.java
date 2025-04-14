package br.com.devtech.controller;

import br.com.devtech.dtos.SitesDTO;
import br.com.devtech.service.SitesServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sites")
@AllArgsConstructor
public class SitesController {

    private final SitesServices sitesServices;

    @PostMapping(value = "/create")
    public ResponseEntity<SitesDTO> create (@RequestBody SitesDTO dto){

        dto = sitesServices.createSite(dto);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/buscar/{id}")
    public ResponseEntity<SitesDTO> buscarSite (@PathVariable Long id){
        SitesDTO dto = sitesServices.findByIdSite(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/buscartodos")
    public ResponseEntity<List<SitesDTO>> buscarTodosSites (){
        List<SitesDTO> dtos = sitesServices.findAllSite();
        return ResponseEntity.ok().body(dtos);
    }

    @PutMapping(value = "/alterar/{id}")
    public ResponseEntity<SitesDTO> alterarSite (@PathVariable Long id, @RequestBody SitesDTO dtoSite){
        SitesDTO dto = sitesServices.updateSites(id, dtoSite);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/apagar/{id}")
    public ResponseEntity<SitesDTO> apagarSite (@PathVariable Long id){
        SitesDTO dto = sitesServices.deleteSite(id);
        return ResponseEntity.ok().body(dto);
    }
}
