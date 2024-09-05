package com.br.servicos.service;

import com.br.servicos.model.Servicos;

import java.util.List;
import java.util.Optional;

public interface ServicosService {
    Servicos create(Servicos servicos);
    Optional<Servicos> findById(Long id);
    List<Servicos> findAll();
    void deleteById(Long id);
    Servicos update(Servicos servicos);
}
