package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class DuenioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_duenio;
    private String nombre_duenio;
    private String apellido;
    private int celular;
    private int dni;
    @OneToMany
    private List<MascotasModel> list_mascotas;
    public DuenioModel() {
    }

    public DuenioModel(Long id_duenio, String nombre_duenio,
                       String apellido, int celular, int dni,
                       List<MascotasModel> list_mascotas) {
        this.id_duenio = id_duenio;
        this.nombre_duenio = nombre_duenio;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
        this.list_mascotas = list_mascotas;
    }
}
