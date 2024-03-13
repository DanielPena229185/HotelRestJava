package com.example.hotel.controller;

import com.example.hotel.model.Reserva;
import com.example.hotel.servicios.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> getReservaciones(){
        return this.reservaService.getAllReservas();
    }

    @PostMapping
    public Reserva postReserva(@RequestBody Reserva reserva){
        return this.reservaService.createReserva(reserva);
    }

    @PutMapping("/{id}")
    public Reserva updateReserva(@RequestBody Reserva reserva, @PathVariable Long id){
        reserva.setId(id);
        return this.reservaService.updateReserva(reserva);
    }

    @DeleteMapping("{id}")
    public void deleteReserva(@PathVariable Long id){
        this.reservaService.deleteReserva(id);
    }
}
