package tz.com.petland_api.model.useCase.useCaseCliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.cadastro.Cadastro;
import tz.com.petland_api.model.dto.clienteDTO.ClienteDTOResponse;
import tz.com.petland_api.model.repository.CadastroRepository;

@Service
public class UseCaseClienteFindAll {

    @Autowired
    private CadastroRepository repository;

    public List<ClienteDTOResponse> clienteFindAll(){

        List<Cadastro> cliente = repository.findAll();
        if (cliente == null) {
            throw new RuntimeException("não foi encontrada nenhuma lista...");
        }
        return cliente.stream().map(ClienteDTOResponse::new).toList();
    }
    
}
