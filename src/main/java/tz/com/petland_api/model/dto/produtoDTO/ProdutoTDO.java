package tz.com.petland_api.model.dto.produtoDTO;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.model.produto.Produto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoTDO {
    private String nome;
    private double valor;
    private boolean servico;

    public ProdutoTDO(Produto produto){
        BeanUtils.copyProperties(produto, this);
    }
    
}
