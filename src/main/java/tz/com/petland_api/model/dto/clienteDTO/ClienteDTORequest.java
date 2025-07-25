package tz.com.petland_api.model.dto.clienteDTO;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.model.cadastro.Endereco;
import tz.com.petland_api.model.cadastro.Perfil;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTORequest {
    private Integer id;
    private String nome;
    private Perfil Perfil;
    private Endereco enderco;
    
}
