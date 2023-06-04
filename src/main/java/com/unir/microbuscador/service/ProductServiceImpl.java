package com.unir.microbuscador.service;

import com.unir.microbuscador.data.ProductoRepository;
import com.unir.microbuscador.model.pojo.Productosimple;
import com.unir.microbuscador.model.request.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductoRepository productoRepository;



    @Override
    public List<Productosimple> getProducts() {

        List<Productosimple> products = productoRepository.findAll();
        return products.isEmpty() ? null : products;
    }

    @Override
    public Productosimple getProduct(String productId) {

        return productoRepository.findById(Long.valueOf(productId)).orElse(null);
    }

    @Override
    public Boolean removeProduct(String productId) {
        return null;
    }

    @Override
    public Productosimple createProduct(CreateProductRequest request) {
        return null;
    }


}
