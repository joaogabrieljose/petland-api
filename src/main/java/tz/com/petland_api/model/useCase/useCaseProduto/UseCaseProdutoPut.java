package tz.com.petland_api.model.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.repository.ProdutoRepository;

@Service
public class UseCaseProdutoPut {
    
    @Autowired
    private ProdutoRepository repository;

    

}
