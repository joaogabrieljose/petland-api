package tz.com.petland_api.cadastros.useCase.useCaseProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.cadastros.model.dto.produtoDTO.ProdutoDTORequest;
import tz.com.petland_api.cadastros.model.dto.produtoDTO.ProdutoTDOResponse;
import tz.com.petland_api.cadastros.model.produto.Produto;
import tz.com.petland_api.cadastros.repository.ProdutoRepository;

@Service
public class UseCaseProduto {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoDTORequest create (Produto produto){
        repository.findByNome(produto.getNome()).ifPresent((use)->{
            throw new RuntimeException("produto já existe");
        });

        if (produto.getId() != null && repository.findById(produto.getId()).isPresent()) {
            throw new RuntimeException("Produto com esse ID já existe.");
        }
        Produto produtoSalvo = repository.save(produto);
        ProdutoDTORequest produtoTDO = new ProdutoDTORequest();
        produtoTDO.setNome(produtoSalvo.getNome());
        produtoTDO.setValor(produtoSalvo.getValor());
        produtoTDO.setServico(produtoSalvo.isServico());
        
        return produtoTDO;
    }
    
}
