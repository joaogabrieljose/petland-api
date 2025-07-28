package tz.com.petland_api.atendimento.model.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.atendimento.model.entity.AtandimentoTipo;
import tz.com.petland_api.atendimento.model.entity.AtendimentoStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtendimentoRequest {
    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergente;
    private AtendimentoStatus status;

    private AtandimentoTipo tipo;

    private Integer animal;

    private Integer cadastro;
    
    private Integer produto;
    
}
