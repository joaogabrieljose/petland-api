package tz.com.petland_api.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.petland_api.atendimento.model.dto.AtendimentoRequest;
import tz.com.petland_api.atendimento.model.dto.AtendimentoResponse;
import tz.com.petland_api.atendimento.useCase.UseCaseAtendimento;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private UseCaseAtendimento useCsae;

    @PostMapping("/")
    public ResponseEntity<Object> atendimento(@RequestBody AtendimentoRequest dto){

        try {
            var atende = useCsae.createAtendimento(dto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    
}
