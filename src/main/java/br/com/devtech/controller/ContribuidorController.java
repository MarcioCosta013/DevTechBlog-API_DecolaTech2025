package br.com.devtech.controller;

import br.com.devtech.dtos.ContribuidorDTO;
import br.com.devtech.service.ContribuidorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contribuidor")
@AllArgsConstructor
public class ContribuidorController {

    private final ContribuidorService contribuidorService;

    @PostMapping(value = "/create")
    public ResponseEntity<ContribuidorDTO> create(@RequestBody ContribuidorDTO dto){

        dto = contribuidorService.create(dto);
        return ResponseEntity.ok().body(dto);

    }

    @GetMapping(value = "/buscar/{id}")
    public ResponseEntity<ContribuidorDTO> buscaContribuidor (@PathVariable Long id) {

        ContribuidorDTO pedido = contribuidorService.findById(id);
        return ResponseEntity.ok().body(pedido);

    }

    @GetMapping(value = "/buscartodos")
    public ResponseEntity<List<ContribuidorDTO>> buscaTodosContribuidor () {

        List<ContribuidorDTO> pedido = contribuidorService.findAll();
        return ResponseEntity.ok().body(pedido);

    }

    @PutMapping(value = "/alterar/{id}")
    public ResponseEntity<ContribuidorDTO> alterar (@PathVariable Long id, @RequestBody ContribuidorDTO dtoContribuidor){
        ContribuidorDTO dto = contribuidorService.update(id, dtoContribuidor);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/apagar/{id}")
    public ResponseEntity<ContribuidorDTO> apagar (@PathVariable Long id){
        return ResponseEntity.ok(contribuidorService.delete(id));
    }

}
