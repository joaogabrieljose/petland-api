package tz.com.petland_api.cadastros.useCase.useCaseCliente;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.cadastros.model.cadastro.Cadastro;
import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTORequest;
import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTOResponse;
import tz.com.petland_api.cadastros.repository.CadastroRepository;

@Service
public class UseCaseCliente {

    @Autowired
    private CadastroRepository repository;

   public ClienteDTOResponse createCliente(ClienteDTORequest request){

    repository.findByNome(request.getNome()).ifPresent((use)->{
        throw new RuntimeException("cliente não encontrado...");
    });

    Cadastro cadastro = new Cadastro();
     BeanUtils.copyProperties(request, cadastro);

    Cadastro clienteAtualizado = repository.save(cadastro);
    return new ClienteDTOResponse(clienteAtualizado);
   }
    
}
