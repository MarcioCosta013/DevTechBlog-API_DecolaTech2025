package br.com.devtech.controller;

import br.com.devtech.dtos.ContribuidorDTO;
import br.com.devtech.service.ContribuidorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<ContribuidorDTO> buscaProduto(@PathVariable Long id) {

        ContribuidorDTO pedido = contribuidorService.findById(id);

        return ResponseEntity.ok().body(pedido);

    }

}
