package com.example.hotel.controller;

import com.example.hotel.model.Huesped;
import com.example.hotel.servicios.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("huesped")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    @GetMapping
    public List<Huesped> getAllHuespedes(){
        return this.huespedService.getAllHuespedes();
    }

    @PostMapping
    public Huesped createHuesped(@RequestBody Huesped huesped){
        return this.huespedService.createHuesped(huesped);
    }

    @PutMapping("{id}")
    public Huesped updateHuesped
            (@RequestBody Huesped huesped,
             @PathVariable Long id){
        huesped.setId(id);
        return this.huespedService.updateHuesped(huesped);
    }

    @DeleteMapping("{id}")
    public void deleteHuesped(@PathVariable Long id){
        this.huespedService.deleteHuesped(id);
    }

}
