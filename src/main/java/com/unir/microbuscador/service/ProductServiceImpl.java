package com.unir.microbuscador.service;

import com.unir.microbuscador.data.ProductoRepository;
import com.unir.microbuscador.model.pojo.Productosimple;
import com.unir.microbuscador.model.request.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public Productosimple updateProduct(String productId, Productosimple productosimple) {
        Productosimple productosimple1 = productoRepository.findById(Long.valueOf(productId)).orElse(null);
        if (productosimple1!=null){
            productosimple1.setProSimCantidad(productosimple.getProSimCantidad());
            productoRepository.save(productosimple1);
        }
        return productosimple1;
    }

    @Override
    public Boolean removeProduct(String productId) {
        Productosimple product = productoRepository.findById(Long.valueOf(productId)).orElse(null);

        if (product != null) {
            productoRepository.delete(product);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override
    public Productosimple createProduct(CreateProductRequest request) {
        if (request != null && StringUtils.hasLength(request.getProSimDescripcion().trim())
                && StringUtils.hasLength(String.valueOf(request.getProSimCantidad()))
                && StringUtils.hasLength(String.valueOf(request.getProSimPrecio()))) {

            Productosimple product = Productosimple.builder().proSimDescripcion(request.getProSimDescripcion()).
                    proSimCantidad(request.getProSimCantidad())
                    .proSimPrecio(request.getProSimPrecio()).build();

            return productoRepository.save(product);
        } else {
            return null;
        }
    }


}
