package com.example.demo.service.mascota;

import com.example.demo.model.MascotasModel;

import java.util.List;

public interface IMascotaService {

    public void PostMascotas(MascotasModel masc);
    public List<MascotasModel> GetMascotas();
    public void deleteMascotas(Long id);
    public MascotasModel findMascotas(Long id);
    public void putMascotas(MascotasModel mascput);

}
