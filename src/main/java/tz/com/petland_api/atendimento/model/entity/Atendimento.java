package tz.com.petland_api.atendimento.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "tab_atendimento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergente;

    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Enumerated(EnumType.STRING)
    private AtandimentoTipo tipo;

    @Column(name = "pet_id")
    private Integer animal;

    @Column(name = "cad_id")
    private Integer cadastro;
    
    @Column(name = "prod_id")
    private Integer produto;

}
