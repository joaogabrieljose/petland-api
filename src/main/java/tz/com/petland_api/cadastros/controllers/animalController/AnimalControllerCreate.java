package tz.com.petland_api.controllers.animalController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.model.dto.animalDTO.AnimalDTORequest;
import tz.com.petland_api.model.useCase.useCaseAnimal.UseCaseAnimalCreate;

@RestController
@RequestMapping("/animais")
public class AnimalControllerCreate {

    @Autowired
    private UseCaseAnimalCreate create;

    @PostMapping("/")
    public ResponseEntity<?> animalCreate(@RequestBody AnimalDTORequest request ){

        try{
            var animal = create.createAnimal(request);
            return ResponseEntity.ok().build();

        }catch(Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
    
}
