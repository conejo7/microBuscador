package com.unir.microbuscador.controller;

import com.unir.microbuscador.model.pojo.Productosimple;
import com.unir.microbuscador.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductoController {

    private final ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Productosimple>> getProducts(@RequestHeader Map<String, String> headers) {
        log.info("headers: {}", headers);
        List<Productosimple> products = service.getProducts();
        if (products != null) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.ok(Collections.emptyList());
        }
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Productosimple> getProduct(@PathVariable String productId) {

        log.info("Request received for product {}", productId);
        Productosimple product = service.getProduct(productId);

        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
