package tz.com.petland_api.cadastros.useCase.useCaseAnimal;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.cadastros.model.animal.Animal;
import tz.com.petland_api.cadastros.model.dto.animalDTO.AnimalDTORequest;
import tz.com.petland_api.cadastros.model.dto.animalDTO.AnimalDTOResponse;
import tz.com.petland_api.cadastros.repository.AnimalRepository;

@Service
public class useCaseAnimalUpdate {

    @Autowired
    private AnimalRepository repository;

    public AnimalDTOResponse updateAnimal(Integer id, AnimalDTORequest request){

        Animal animal = repository.findById(id).orElseThrow(()-> new RuntimeException("animal não encontrado"));

        BeanUtils.copyProperties(request, animal);

        Animal animalSalvo = repository.save(animal);

        return new AnimalDTOResponse(animalSalvo);
    }
    
}
