package tz.com.petland_api.cadastros.controllers.clienteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.useCase.useCaseCliente.UseCaseClienteFindAll;

@RestController
@RequestMapping("/clientes")
public class ClienteControllerFindAll {

    @Autowired
    private UseCaseClienteFindAll useCase;

    @GetMapping("/")
    public ResponseEntity<Object> findAllClientes(){

        try {
            var novoCliente = useCase.clienteFindAll();
            return ResponseEntity.ok().body(novoCliente);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
