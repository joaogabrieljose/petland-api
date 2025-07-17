package tz.com.petland_api.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_cadastro")
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //garantir que esse id nao seja intanciado, sera gerenciado pelo spring
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;

    //usa-se embedded para embuti as carateristicas 
    @Embedded
    private Perfil Perfil;
    @Embedded
    private Endereco enderco;
}
