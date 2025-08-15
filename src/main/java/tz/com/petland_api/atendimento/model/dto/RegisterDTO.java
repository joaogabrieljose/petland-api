package tz.com.petland_api.atendimento.model.dto;

import tz.com.petland_api.atendimento.model.entity.UserRoiles;

public record RegisterDTO(String login, String password, UserRoiles role) {
    
}
