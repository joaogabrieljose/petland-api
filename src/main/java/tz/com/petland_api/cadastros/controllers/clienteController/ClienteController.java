package tz.com.petland_api.cadastros.controllers.clienteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTORequest;
import tz.com.petland_api.cadastros.useCase.useCaseCliente.UseCaseCliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private UseCaseCliente useCase;

    @PostMapping("/")
    public ResponseEntity<Object> createCliente(@RequestBody ClienteDTORequest request){

        try {
            var cliente = useCase.createCliente(request);
            return ResponseEntity.ok().body(cliente);
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
