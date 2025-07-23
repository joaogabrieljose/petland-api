package tz.com.petland_api.model.useCase.useCaseAnimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.repository.AnimalRepository;

@Service
public class UseCaseAnimalCreate {

    @Autowired
    private AnimalRepository repository;
    
}
