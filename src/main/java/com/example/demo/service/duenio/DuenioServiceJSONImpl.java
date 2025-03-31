package com.example.demo.service.duenio;


import com.example.demo.model.DuenioModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import com.example.demo.repository.IDuenioRepo;
@Primary
@Service
public class DuenioServiceJSONImpl implements IDuenioService {


    //ESTO VENDRIA SIENDO DESERIALIZACION
    @Override
    public List<DuenioModel> getDuenio() {
         List<DuenioModel>  duenio;


         try {
                duenio = new ObjectMapper().readValue(this.getClass()
                                .getResourceAsStream("/data.json"),
                        new TypeReference<List<DuenioModel>>() { });

                return duenio;
         }catch (IOException e){
            throw  new RuntimeException(e);
         }
    }
}
