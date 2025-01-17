package com.example.demo.controller;

import com.example.demo.model.DuenioModel;
import com.example.demo.service.duenio.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/dueño")
public class DuenioController  {
    @Autowired
    private IDuenioService due_serv;


    //Este codigo era para ver si se puede capturar por id una mascota y a que dueño pertenece
        @GetMapping("/get/{id_dueno}")
       public ResponseEntity<?>  findDuenioMascotaById(@PathVariable Long id_dueno){
            for (DuenioModel e  :  due_serv.getDuenio()) {
                if(e.getId_duenio().equals(id_dueno)){
                     return  ResponseEntity.noContent().build();
                }
            }
           return  ResponseEntity.notFound().build();
      }



    @GetMapping("/get")
    public List<DuenioModel> getDueño(){
        return due_serv.getDuenio();
    }

    @PostMapping("/post")
    public ResponseEntity<?>  postDueño(@RequestBody DuenioModel due){
        due_serv.postDuenio(due);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{dueño}")
                .buildAndExpand(due.getNombre_duenio())
                .toUri();
        return ResponseEntity.created(location).build();
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
