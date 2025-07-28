package tz.com.petland_api.cadastros.controllers.animalController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.cadastros.useCase.useCaseAnimal.UseCaseAnimalFindAll;

@RestController
@RequestMapping("/animais")
public class AnimalControllerFindAll {

    @Autowired
    private UseCaseAnimalFindAll useCase;

    @GetMapping("/")
    public ResponseEntity<?> findAllAnimal(){
        
        try{
            var dto = useCase.findAllAnimal();
            return ResponseEntity.ok().body(dto);
        }catch(Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
    
}
