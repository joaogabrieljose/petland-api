package tz.com.petland_api.cadastros.useCase.useCaseAnimal;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import tz.com.petland_api.cadastros.model.animal.Animal;
import tz.com.petland_api.cadastros.model.dto.animalDTO.AnimalDTOResponse;
import tz.com.petland_api.cadastros.repository.AnimalRepository;

@Service
public class UseCaseAnimalFindAll {

    @Autowired
    private AnimalRepository repository;

    public List<AnimalDTOResponse> findAllAnimal(){
        List<Animal> animalList = repository.findAll();

        if (animalList.isEmpty()) {
            throw new RuntimeException("lista vazia...");   
        }
        return animalList.stream().map(AnimalDTOResponse::new).toList();
    }
    
}
