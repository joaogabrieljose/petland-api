package tz.com.petland_api.cadastros.controllers.clienteController;

import org.hibernate.id.IncrementGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.useCase.useCaseCliente.UseCaseClienteDelete;

@RestController
@RequestMapping("/clientes")
public class ClienteControllerDelete {

    @Autowired
    private UseCaseClienteDelete useCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCliente(@PathVariable Integer id){

        try {
            useCase.clienteDelete(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
