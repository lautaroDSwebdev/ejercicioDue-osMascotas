package com.example.demo.service.dueño;

//import com.example.demo.dto.DuenioMascotaDTOModel;
import com.example.demo.model.DuenioModel;

import java.util.List;

public interface IDuenioService {

    public List<DuenioModel> getDuenio();
//    public Optional<DuenioMascotaDTOModel> getDuenioById(Long id);
    public void postDuenio(DuenioModel e);
    public void deleteDuenio(Long id);
    public DuenioModel findDuenio(Long id);
    public void putDuenio(DuenioModel due);

}
