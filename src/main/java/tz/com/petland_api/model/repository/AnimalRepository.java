package tz.com.petland_api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.petland_api.model.animal.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
