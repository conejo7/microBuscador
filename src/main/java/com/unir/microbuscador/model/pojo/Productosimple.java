package com.unir.microbuscador.model.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
