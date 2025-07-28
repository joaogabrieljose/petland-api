package tz.com.petland_api.cadastros.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.petland_api.cadastros.model.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Optional<Produto> findByNome(String nome);
    
}
