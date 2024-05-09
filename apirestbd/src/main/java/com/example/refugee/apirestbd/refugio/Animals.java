package com.example.refugee.apirestbd.refugio;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animals {

    @Id
    @GeneratedValue
    private Integer idAnimal;
    @Basic
    private String Especie;
    private String Raza;
    private Integer EstadiaMeses;
    private String Vacunado;
    private String Esterilizado;

}
