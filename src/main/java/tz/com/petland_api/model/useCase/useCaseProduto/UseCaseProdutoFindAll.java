package tz.com.petland_api.model.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.repository.ProdutoRepository;

@Service
public class UseCaseProdutoFindAll {

    @Autowired
    private ProdutoRepository repository;

    public Object findAllProduto(){
        var lista = repository.findAll();

        if (lista == null) {
            throw new RuntimeException("produto não encontrado...");
        }
        return lista;
    }
    
}
