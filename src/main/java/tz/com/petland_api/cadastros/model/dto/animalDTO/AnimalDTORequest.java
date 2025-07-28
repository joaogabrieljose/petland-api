package tz.com.petland_api.cadastros.model.dto.animalDTO;

import java.time.LocalDate;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.cadastros.model.animal.AnimalEspecie;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTORequest {
    
    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;
    
}
