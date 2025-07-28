package tz.com.petland_api.cadastros.model.dto.produtoDTO;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProdutoDTORequest {     
    private String nome;
    private double valor;
    private boolean servico;
    
}
