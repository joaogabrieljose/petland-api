package tz.com.petland_api.model.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.dto.produtoDTO.ProdutoTDO;
import tz.com.petland_api.model.produto.Produto;
import tz.com.petland_api.model.repository.ProdutoRepository;

@Service
public class UseCaseProduto {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoTDO create (Produto produto){

        if (produto.getId() != null && repository.findById(produto.getId()).isPresent()) {
            throw new RuntimeException("Produto com esse ID já existe.");
        }
        Produto produtoSalvo = repository.save(produto);
        ProdutoTDO produtoTDO = new ProdutoTDO();
        produtoTDO.setNome(produtoSalvo.getNome());
        produtoTDO.setValor(produtoSalvo.getValor());
        produtoTDO.setServico(produtoSalvo.isServico());
        
        return produtoTDO;
    }
    
}
