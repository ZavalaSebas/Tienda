package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Esto es una asociacion, por lo que debe ponerse el id como se muestra en la tabla BD
    @Column(name="id_credito")
    private Long idCredito;

    private double limite;


    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
}

