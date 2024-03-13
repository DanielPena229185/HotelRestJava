package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity()
@Data()
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_entrada")
    private String fechaEntrada;

    @Column(name = "fecha_salida")
    private String fechaSalida;

    @Column(name = "valor")
    private double valor;

    @Column(name = "forma_pago")
    private String formaPago;

    @ManyToOne()
    private Huesped huesped;
}
