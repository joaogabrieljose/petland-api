package tz.com.petland_api.model.useCase.useCaseCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.cadastro.Cadastro;
import tz.com.petland_api.model.repository.CadastroRepository;

@Service
public class UseCaseClienteDelete {

    @Autowired
    private CadastroRepository repository;


    public void clienteDelete(Integer id){

       Cadastro cadastro = repository.findById(id).orElseThrow(()-> 
            new RuntimeException("cliente com id "+ id + "não encontrado"));
       repository.delete(cadastro);
    }
    
}
