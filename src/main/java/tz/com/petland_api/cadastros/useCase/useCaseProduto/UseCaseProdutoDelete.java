package tz.com.petland_api.cadastros.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.cadastros.model.produto.Produto;
import tz.com.petland_api.cadastros.repository.ProdutoRepository;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class UseCaseProdutoDelete {

    @Autowired
    private ProdutoRepository repository;

    public void produtoDelete(Integer id) {
        Produto produto = repository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Produto não encontrado com ID: " + id
            ));
        repository.delete(produto);
    }
} 
