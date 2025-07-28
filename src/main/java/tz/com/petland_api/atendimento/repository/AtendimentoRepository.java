package tz.com.petland_api.atendimento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tz.com.petland_api.atendimento.model.entity.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {

    Optional<Atendimento>findByDescricao(String descricao);
    
}
