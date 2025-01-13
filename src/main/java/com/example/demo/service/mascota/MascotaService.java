package com.example.demo.service.mascota;

import com.example.demo.model.MascotasModel;
import com.example.demo.repository.IMascotaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepo mascota_repo;
    @Override
    public void PostMascotas(MascotasModel masc) {
        mascota_repo.save(masc);
    }

    @Override
    public List<MascotasModel> GetMascotas() {
        List<MascotasModel> get_pet = mascota_repo.findAll();
        return get_pet;
    }

    @Override
    public void deleteMascotas(Long id) {
        mascota_repo.deleteById(id);
    }

    @Override
    public MascotasModel findMascotas(Long id) {
        MascotasModel find_mascotas = mascota_repo.findById(id).orElse(null);
        return find_mascotas;
    }

    @Override
    public void putMascotas(MascotasModel mascput) {
        this.PostMascotas(mascput);
    }
}
