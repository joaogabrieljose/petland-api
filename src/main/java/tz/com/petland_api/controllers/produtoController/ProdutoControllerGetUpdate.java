package tz.com.petland_api.controllers.produtoController;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.model.dto.produtoDTO.ProdutoDTORequest;
import tz.com.petland_api.model.dto.produtoDTO.ProdutoTDOResponse;
import tz.com.petland_api.model.produto.Produto;
import tz.com.petland_api.model.useCase.useCaseProduto.UseCaseProdutoPut;

@RestController
@RequestMapping("/produtos")
public class ProdutoControllerGetUpdate {

    @Autowired
    private UseCaseProdutoPut useCase;

    @PutMapping("/{id}")
    public ResponseEntity<?> getUpdate(@PathVariable Integer id, @RequestBody ProdutoDTORequest produtoTDO) {
        try {
            ProdutoTDOResponse atualizado = useCase.updateProduto(id, produtoTDO);
            return ResponseEntity.ok(atualizado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao atualizar produto: " + e.getMessage());
        }
    }
}
