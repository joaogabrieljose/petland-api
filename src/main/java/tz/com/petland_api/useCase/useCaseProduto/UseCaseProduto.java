package tz.com.petland_api.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.produto.Produto;
import tz.com.petland_api.repository.ProdutoRepository;

@Service
public class UseCaseProduto {

    @Autowired
    private ProdutoRepository repository;

    public Object create (Produto produto){

        if (produto.getId() != null && repository.findById(produto.getId()).isPresent()) {
            throw new RuntimeException("Produto com esse ID já existe.");
        }
        return repository.save(produto);
    }
    
}
