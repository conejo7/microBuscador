package com.unir.microbuscador.service;

import com.unir.microbuscador.model.pojo.Productosimple;
import com.unir.microbuscador.model.request.CreateProductRequest;

import java.util.List;

public interface ProductService {

    List<Productosimple> getProducts();
    //List<Productosimple> getProductos();

    Productosimple getProduct(String productId);

    Productosimple updateProduct(String productId, Productosimple productosimple);


    Boolean removeProduct(String productId);

    Productosimple createProduct(CreateProductRequest request);

}
