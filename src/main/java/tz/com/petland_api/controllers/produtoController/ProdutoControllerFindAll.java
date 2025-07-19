package tz.com.petland_api.controllers.produtoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.model.useCase.useCaseProduto.UseCaseProdutoFindAll;

@RestController
@RequestMapping("/produtos")
public class ProdutoControllerFindAll {

    @Autowired
    private UseCaseProdutoFindAll useCase;

    @GetMapping("/")
    public ResponseEntity<?> getProdutos(){
        try {
            var lista = useCase.findAllProduto();
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
