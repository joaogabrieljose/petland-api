package tz.com.petland_api.model.useCase.useCaseProduto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.dto.produtoDTO.ProdutoTDO;
import tz.com.petland_api.model.produto.Produto;
import tz.com.petland_api.model.repository.ProdutoRepository;

@Service
public class UseCaseProdutoPut {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoTDO updateProduto(Integer id, ProdutoTDO dto) {

        Produto produto = dto.toEntity();  
        produto.setId(id);       

        Produto produtoExistente = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setServico(produto.isServico());
        produtoExistente.setValor(produto.getValor());

        Produto atualizado = repository.save(produtoExistente);

        return new ProdutoTDO(atualizado); // retorna o DTO atualizado
    }


}