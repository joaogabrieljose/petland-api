package tz.com.petland_api.cadastros.model.dto.clienteDTO;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tz.com.petland_api.cadastros.model.cadastro.Cadastro;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTOResponse extends ClienteDTORequest{
    private Integer id;

    public ClienteDTOResponse (Cadastro entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Cadastro toCadastro(){
        Cadastro cadastro = new Cadastro();
        BeanUtils.copyProperties(this, cadastro);
        return cadastro;
    }
    
}
