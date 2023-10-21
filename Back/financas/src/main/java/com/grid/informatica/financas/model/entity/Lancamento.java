package com.grid.informatica.financas.model.entity;

import com.grid.informatica.financas.model.enums.StatusLancamento;
import com.grid.informatica.financas.model.enums.TipoLancamento;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "lancamento", schema = "financas")
@Data
@Builder
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Integer mes;
    private Integer ano;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    private BigDecimal valor;

    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @Enumerated(EnumType.STRING)
    private StatusLancamento status;

}
