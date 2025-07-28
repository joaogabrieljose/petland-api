package tz.com.petland_api.cadastros.useCase.useCaseAnimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import tz.com.petland_api.cadastros.model.animal.Animal;
import tz.com.petland_api.cadastros.repository.AnimalRepository;

@Service
public class UseCaseAnimalDelete {
    
    @Autowired
    private AnimalRepository repository;

    public void deleteAnimal(Integer id){

        Animal animal = repository.findById(id).orElseThrow(()-> 
            new ResponseStatusException(HttpStatus.NOT_FOUND ,"user not" + id));
            
        repository.delete(animal);
    }
}
