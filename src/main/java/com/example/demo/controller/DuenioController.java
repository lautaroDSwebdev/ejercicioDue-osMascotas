package com.example.demo.controller;

import com.example.demo.model.DuenioModel;
import com.example.demo.service.duenio.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/duenio")
public class DuenioController  {

//    ESTO ES INYECCION DE DEPENCENCIAS
//    LO MISMO QUE ESTO QUE HACIAS EN JAVA VANILLA IDuenioService due_serv = new IDuenioService()
    @Qualifier("listaDuenio")
    @Autowired
    private IDuenioService due_serv;


    //Este codigo era para ver si se puede capturar por id una mascota y a que dueño pertenece
        @GetMapping("/get/{id_dueno}")
       public ResponseEntity<?>  findDuenioMascotaById(@PathVariable Long id_dueno){
            for (DuenioModel e  :  due_serv.getDuenio()) {
                if(e.getId_duenio().equals(id_dueno)){
                     return  ResponseEntity.ok(e);
                }
            }
           return  ResponseEntity.notFound().build();
      }



    @GetMapping("/get")
    public List<DuenioModel> getDueño(){
        return due_serv.getDuenio();
    }

//     @PostMapping("/post")
//     public ResponseEntity<?>  postDueño(@RequestBody DuenioModel due){
//         due_serv.postDuenio(due);
//         URI location = ServletUriComponentsBuilder
//                 .fromCurrentRequest()
//                 .path("/{id_dueno}")
//                 .buildAndExpand(due.getId_duenio())
//                 .toUri();
//         return ResponseEntity.created(location).body(due);
//     }
//
//     @DeleteMapping("/del/{id_due}")
//     public String delDueño( @PathVariable Long id_due){
//         due_serv.deleteDuenio(id_due);
//         return "Dueño eliminado con exito";
//     }
//     @PutMapping("/put")
//     public DuenioModel putDueño(@RequestBody DuenioModel due){
//         due_serv.putDuenio(due);
//         return due_serv.findDuenio(due.getId_duenio());
//
//     }
}
