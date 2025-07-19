package tz.com.petland_api.model.useCase.useCaseProduto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.produto.Produto;
import tz.com.petland_api.model.repository.ProdutoRepository;

@Service
public class UseCaseProdutoDelete {

    @Autowired
    private ProdutoRepository repository;

    public void produtoDelete(Integer id){
        Optional<Produto> produtoDelete = repository.findById(id);
        if (produtoDelete.isPresent()) {
            repository.deleteById(id);
            throw new IllegalArgumentException("produto não encontra");
        }
    }
}
