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
public class Owners {

    @Id
    @GeneratedValue
    private Integer idDueño;
    @Basic
    private String Nombre;
    private String Telefono;
}
