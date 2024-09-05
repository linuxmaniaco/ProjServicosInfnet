package com.br.servicos.service.impl;

import com.br.servicos.model.Servicos;
import com.br.servicos.repository.ServicosRepository;
import com.br.servicos.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServicosServicesImpl implements ServicosService {

    private final ServicosRepository servicosRepository;

    @Override
    public Servicos create(Servicos servicos) {
        return servicosRepository.save(servicos);
    }

    @Override
    public Optional<Servicos> findById(Long id) {
        return servicosRepository.findById(id);
    }

    @Override
    public List<Servicos> findAll() {
        return servicosRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        servicosRepository.deleteById(id);
    }

    @Override
    public Servicos update(Servicos servicos) {
        return servicosRepository.save(servicos);
    }
}
