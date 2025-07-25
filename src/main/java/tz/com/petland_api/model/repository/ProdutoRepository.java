package tz.com.petland_api.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.petland_api.model.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Optional<Produto> findByNome(String nome);
    
}
