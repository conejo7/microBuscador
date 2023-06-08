package com.unir.microbuscador.model.request;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRequest {

    //private long proSimId;
    private String proSimDescripcion;
    private int proSimCantidad;
    private BigDecimal proSimPrecio;

}
