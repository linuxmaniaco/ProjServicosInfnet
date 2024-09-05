package com.br.servicos.repository;

import com.br.servicos.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicosRepository extends JpaRepository<Servicos, Long> {
}
