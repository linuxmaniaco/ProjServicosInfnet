package com.br.servicos.controller;

import com.br.servicos.model.Servicos;
import com.br.servicos.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ServicosController {
    private final ServicosService servicosService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(servicosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Servicos> optionalServicos = servicosService.findById(id);
        if(optionalServicos.isPresent()) {
            return ResponseEntity.ok(optionalServicos.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        servicosService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Servicos servicos){
        Servicos servicosSaved  = servicosService.create(servicos);
        return ResponseEntity.ok(servicosSaved);
    }

    public ResponseEntity<?> update(@RequestBody Servicos servicos){
        servicosService.update(servicos);
        return ResponseEntity.ok().build();
    }

}
