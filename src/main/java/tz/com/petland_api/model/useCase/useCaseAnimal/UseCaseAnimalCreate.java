package tz.com.petland_api.model.useCase.useCaseAnimal;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.model.animal.Animal;
import tz.com.petland_api.model.dto.animalDTO.AnimalDTORequest;
import tz.com.petland_api.model.dto.animalDTO.AnimalDTOResponse;
import tz.com.petland_api.model.repository.AnimalRepository;

@Service
public class UseCaseAnimalCreate {

    @Autowired
    private AnimalRepository repository;

    public AnimalDTOResponse createAnimal(AnimalDTORequest dto){

        repository.findByNome(dto.getNome()).ifPresent((use)->{
            throw new RuntimeException("Animal já registado...");
        });


        Animal animalDTO = new Animal();
        BeanUtils.copyProperties(dto, animalDTO);

        Animal animalSalvo = repository.save(animalDTO);
        return new AnimalDTOResponse(animalSalvo);
    }
    
}
