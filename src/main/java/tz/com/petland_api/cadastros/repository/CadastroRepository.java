package tz.com.petland_api.cadastros.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tz.com.petland_api.cadastros.model.cadastro.Cadastro;

@Repository
public interface CadastroRepository  extends JpaRepository<Cadastro, Integer>{
    Optional<Cadastro> findByNome(String nome);
}
