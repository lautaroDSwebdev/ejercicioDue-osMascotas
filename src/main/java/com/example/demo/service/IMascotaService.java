package com.example.demo.service;

import com.example.demo.model.MascotasModel;

import java.util.List;

public interface IMascotaService {

    public void PostMascotas(MascotasModel masc);
    public void deleteMascotas(Long id);
    public MascotasModel findMascotas(Long id);
    public void putMascotas(MascotasModel mascput);
}
