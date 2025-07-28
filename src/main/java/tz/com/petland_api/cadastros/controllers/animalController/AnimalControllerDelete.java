package tz.com.petland_api.cadastros.controllers.animalController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.useCase.useCaseAnimal.UseCaseAnimalDelete;

@RestController
@RequestMapping("/animais")
public class AnimalControllerDelete {

    @Autowired
    private UseCaseAnimalDelete useCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteController(@PathVariable Integer id){

        try {
            useCase.deleteAnimal(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    
}
