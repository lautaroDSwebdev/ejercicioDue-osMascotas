package com.example.demo.controller;

import com.example.demo.model.MascotasModel;
import com.example.demo.service.mascota.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotasController {

    @Autowired
    private IMascotaService masc_service;
    @GetMapping("/get/{Id_mascota}")
    public ResponseEntity<?> getMascota(@PathVariable Long Id_mascota){

        for (MascotasModel e : masc_service.GetMascotas()) {
            if (e.getId_mascota().equals(Id_mascota)){
                return ResponseEntity.ok(e);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró");

    }
    @GetMapping("/get")
    public List<MascotasModel> getMascota(){
        return masc_service.GetMascotas();
    }

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
