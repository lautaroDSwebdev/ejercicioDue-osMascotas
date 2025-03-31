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
    private Integer celular;
    private Integer dni;
    @OneToMany
    private List<MascotasModel> list_mascotas;

    public DuenioModel() {
    }


    public DuenioModel(String apellido,
                       Integer celular,
                       Integer dni,
                       Long id_duenio,
                       List<MascotasModel> list_mascotas,
                       String nombre_duenio) {
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
        this.id_duenio = id_duenio;
        this.list_mascotas = list_mascotas;
        this.nombre_duenio = nombre_duenio;
    }
}
