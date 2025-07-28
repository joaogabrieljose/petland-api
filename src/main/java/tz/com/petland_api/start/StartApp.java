package tz.com.petland_api.start;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import tz.com.petland_api.cadastros.repository.AnimalRepository;
import tz.com.petland_api.cadastros.repository.CadastroRepository;



@Component
public class StartApp implements ApplicationRunner{

    
    @Autowired
    private CadastroRepository repository;
    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
            Animal animal = new Animal();
            animal.setNome("Doquesa");
            animal.setAniversario(LocalDate.of(2021,12, 15));
            animal.setEspecie(AnimalEspecie.CACHORRO);

            animalRepository.save(animal); 
        */
    } 
    
}
