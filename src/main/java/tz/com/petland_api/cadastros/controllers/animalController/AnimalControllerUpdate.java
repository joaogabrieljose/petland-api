package tz.com.petland_api.cadastros.controllers.animalController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.model.dto.animalDTO.AnimalDTORequest;
import tz.com.petland_api.cadastros.useCase.useCaseAnimal.useCaseAnimalUpdate;

@RestController
@RequestMapping("/animais")
public class AnimalControllerUpdate {

    @Autowired
    private useCaseAnimalUpdate useCase;

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Integer id, @RequestBody AnimalDTORequest request){

        try{
            var dto = useCase.updateAnimal(id, request);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    
}
