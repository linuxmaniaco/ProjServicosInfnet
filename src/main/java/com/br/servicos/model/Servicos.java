package com.br.servicos.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private String cor;
    private BigDecimal valor;
    @Column(name = "DATAHORA")
    private LocalDateTime dataHora;
    private String vendedor;
    @Column(name = "vendedor_id")
    private long idVendedor;
    private String tiposervico;

}
