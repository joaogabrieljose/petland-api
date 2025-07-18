package tz.com.petland_api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.petland_api.model.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
