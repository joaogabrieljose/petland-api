package tz.com.petland_api.model.dto.produtoDTO;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.model.produto.Produto;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProdutoTDOResponse extends ProdutoDTORequest{
    public ProdutoTDOResponse(Produto produto){
        BeanUtils.copyProperties(produto, this);
    }

    public Produto toEntity() {
        Produto produto = new Produto();
        BeanUtils.copyProperties(this, produto);
        return produto;
    }

}
