package tz.com.petland_api.cadastros.controllers.clienteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTORequest;
import tz.com.petland_api.cadastros.useCase.useCaseCliente.UseCaseClienteUp;

@RestController
@RequestMapping("/clientes")
public class ClienteControllerUpdate {

    @Autowired
    private UseCaseClienteUp useCase;

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Integer id, @RequestBody ClienteDTORequest request){

        try {
            var update = useCase.clienteUpdate(id, request);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
