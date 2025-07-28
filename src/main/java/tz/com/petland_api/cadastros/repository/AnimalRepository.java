package tz.com.petland_api.cadastros.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.petland_api.cadastros.model.animal.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{
      Optional<Animal> findByNome(String nome);
}
