package com.unir.microbuscador.model.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
public class Productosimple {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pro_sim_id")
    private long proSimId;
    @Basic
    @Column(name = "pro_sim_descripcion")
    private String proSimDescripcion;
    @Basic
    @Column(name = "pro_sim_cantidad")
    private int proSimCantidad;
    @Basic
    @Column(name = "pro_sim_precio")
    private BigDecimal proSimPrecio;

    }
