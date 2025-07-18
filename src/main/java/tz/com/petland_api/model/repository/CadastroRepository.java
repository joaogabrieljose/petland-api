package tz.com.petland_api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tz.com.petland_api.model.cadastro.Cadastro;

@Repository
public interface CadastroRepository  extends JpaRepository<Cadastro, Integer>{
    
}
