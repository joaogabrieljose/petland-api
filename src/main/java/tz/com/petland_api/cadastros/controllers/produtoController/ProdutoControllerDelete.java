package tz.com.petland_api.cadastros.controllers.produtoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.useCase.useCaseProduto.UseCaseProdutoDelete;

@RestController
@RequestMapping("/produtos")
public class ProdutoControllerDelete {

    @Autowired
    private UseCaseProdutoDelete useCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> produtoDelete (@PathVariable Integer id){
        useCase.produtoDelete(id);
        return ResponseEntity.noContent().build();
    }
    
}
