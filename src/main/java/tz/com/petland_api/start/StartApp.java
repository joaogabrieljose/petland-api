package tz.com.petland_api.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import tz.com.petland_api.model.Cadastro;
import tz.com.petland_api.model.Endereco;
import tz.com.petland_api.model.Perfil;
import tz.com.petland_api.repository.CadastroRepository;

@Component
public class StartApp implements ApplicationRunner{

    @Autowired
    private CadastroRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Joao jose");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);

        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("costa da muralha");

        cadastro.setEnderco(endereco);
        repository.save(cadastro);

    }
    
}
