package tz.com.petland_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tz.com.petland_api.model.Cadastro;

@Repository
public interface CadastroRepository  extends JpaRepository<Cadastro, Integer>{
    
}
