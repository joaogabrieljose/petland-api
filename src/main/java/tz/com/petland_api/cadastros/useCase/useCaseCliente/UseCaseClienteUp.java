package tz.com.petland_api.cadastros.useCase.useCaseCliente;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.cadastros.model.cadastro.Cadastro;
import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTORequest;
import tz.com.petland_api.cadastros.model.dto.clienteDTO.ClienteDTOResponse;
import tz.com.petland_api.cadastros.repository.CadastroRepository;

@Service
public class UseCaseClienteUp {

    @Autowired
    private CadastroRepository repository;

    public ClienteDTOResponse clienteUpdate(Integer id, ClienteDTORequest request){

        Cadastro cadastro = repository.findById(id).
            orElseThrow(()-> new  RuntimeException("cliente com "+ id +" não foi encontrado"));

            BeanUtils.copyProperties(request, cadastro);
            repository.save(cadastro);

            return new ClienteDTOResponse(cadastro);
    }
    
}
