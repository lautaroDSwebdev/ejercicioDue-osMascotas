package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MascotasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id_mascota;
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String color;

    public MascotasModel() {
    }

    public MascotasModel(Long id_mascota, String nombre_mascota, String especie, String raza, String color) {
        Id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
