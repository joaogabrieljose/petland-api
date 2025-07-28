package tz.com.petland_api.atendimento.useCase;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.petland_api.atendimento.model.dto.AtendimentoRequest;
import tz.com.petland_api.atendimento.model.dto.AtendimentoResponse;
import tz.com.petland_api.atendimento.model.entity.Atendimento;
import tz.com.petland_api.atendimento.repository.AtendimentoRepository;

@Service
public class UseCaseAtendimento {

    @Autowired
    private AtendimentoRepository repository;

    public AtendimentoResponse createAtendimento(AtendimentoRequest request){

        repository.findByDescricao(request).ifPresent((use)-> {
            throw new RuntimeException("");
        });
        Atendimento atendimento = new Atendimento();
        BeanUtils.copyProperties(request, atendimento);
        repository.save(atendimento);
        return new AtendimentoResponse(atendimento);

    }
}
