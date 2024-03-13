package com.example.hotel.servicios;

import com.example.hotel.model.Huesped;
import com.example.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //Mostrar huesped
    public List<Huesped> getAllHuespedes(){
        return this.huespedRepository.findAll();
    }

    //crear huesped
    public Huesped createHuesped(Huesped huesped){
        return this.huespedRepository.save(huesped);
    }

    //editar huesped
    public Huesped updateHuesped(Huesped huesped){
        return this.huespedRepository.save(huesped);
    }

    //eliminar
    public void deleteHuesped(Long idHuesped){
        this.huespedRepository.deleteById(idHuesped);
    }
}
