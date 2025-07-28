package tz.com.petland_api.atendimento.model.dto;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.atendimento.model.entity.Atendimento;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AtendimentoResponse extends AtendimentoRequest{
    private Integer id;

    public AtendimentoResponse(Atendimento entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Atendimento toAtendimento(){
        Atendimento atendimento = new Atendimento();
        BeanUtils.copyProperties(this, atendimento);
        return atendimento;
    }
    
}
