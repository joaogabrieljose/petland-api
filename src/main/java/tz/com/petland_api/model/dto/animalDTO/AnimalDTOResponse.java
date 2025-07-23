package tz.com.petland_api.model.dto.animalDTO;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.model.animal.Animal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTOResponse extends AnimalDTORequest{

    public AnimalDTOResponse(Animal response){
        BeanUtils.copyProperties(response, this);
    }
    
    public Animal toAnimal(){
        Animal animal = new Animal();
        BeanUtils.copyProperties(this, animal);
        return animal;
    }
}
