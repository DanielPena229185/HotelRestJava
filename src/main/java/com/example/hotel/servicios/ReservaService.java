package com.example.hotel.servicios;

import com.example.hotel.model.Reserva;
import com.example.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar Reserva
    public List<Reserva> getAllReservas(){
        return this.reservaRepository.findAll();
    }

    //crear Reserva
    public Reserva createReserva(Reserva Reserva){
        return this.reservaRepository.save(Reserva);
    }

    //editar Reserva
    public Reserva updateReserva(Reserva Reserva){
        return this.reservaRepository.save(Reserva);
    }

    //eliminar
    public void deleteReserva(Long idReserva){
        this.reservaRepository.deleteById(idReserva);
    }

}
