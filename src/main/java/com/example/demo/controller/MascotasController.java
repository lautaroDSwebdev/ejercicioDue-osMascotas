package com.example.demo.controller;

import com.example.demo.model.MascotasModel;
import com.example.demo.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascota")
public class MascotasController {

    @Autowired
    private IMascotaService masc_service;


    @PostMapping("/post")
    public String postMascota(@RequestBody MascotasModel e){
        masc_service.PostMascotas(e);
        return "Mascota creada con exito";
    }

    @PutMapping("/put")
    public MascotasModel putMascotas(@RequestBody MascotasModel body ){
        masc_service.putMascotas(body);
        return masc_service.findMascotas(body.getId_mascota());
    }

    @DeleteMapping("/del/{id_mascota}")
    public String delMascotas(@PathVariable Long id_mascota ){
        masc_service.deleteMascotas(id_mascota);
        return "Mascota eliminada";
    }
}
