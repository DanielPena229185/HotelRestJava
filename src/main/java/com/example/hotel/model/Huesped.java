package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "huespedes")
@Data
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "huesped", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Reserva> reservas = new ArrayList<>();
}
