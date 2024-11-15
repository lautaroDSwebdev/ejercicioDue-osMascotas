package com.example.demo.controller;

//import com.example.demo.dto.DuenioMascotaDTOModel;
import com.example.demo.model.DuenioModel;
import com.example.demo.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dueño")
public class DuenioController  {
    @Autowired
    private IDuenioService due_serv;
//Este codigo era para ver si se puede capturar por id una mascota y a que dueño pertenece
//    @GetMapping("/get/{id_mascota}")
//    public ResponseEntity<DuenioMascotaDTOModel>  findDuenioMascotaById(@PathVariable Long id_mascota){
//        return new ResponseEntity<>(this.due_serv.getDuenioById(id_mascota) , HttpStatus.OK);
//    }
    @GetMapping("/get")
    public List<DuenioModel> getDueño(){
        return due_serv.getDuenio();
    }

    @PostMapping("/post")
    public String postDueño(@RequestBody DuenioModel due){
        due_serv.postDuenio(due);
        return "dueño creado con exito";
    }

    @DeleteMapping("/del/{id_due}")
    public String delDueño( @PathVariable Long id_due){
        due_serv.deleteDuenio(id_due);
        return "Dueño eliminado con exito";
    }
    @PutMapping("/put")
    public DuenioModel putDueño(@RequestBody DuenioModel due){
        due_serv.putDuenio(due);
        return due_serv.findDuenio(due.getId_duenio());

    }
}
