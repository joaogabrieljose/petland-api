package tz.com.petland_api.cadastros.controllers.produtoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.model.produto.Produto;
import tz.com.petland_api.cadastros.useCase.useCaseProduto.UseCaseProduto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired 
    private UseCaseProduto useCaseProduto;



    @PostMapping("/")
    public ResponseEntity<Object> create (@RequestBody Produto produto){
        try{
            var novoProduto = useCaseProduto.create(produto);
            return ResponseEntity.ok(novoProduto);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    
}
