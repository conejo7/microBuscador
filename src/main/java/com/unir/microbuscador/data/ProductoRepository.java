package com.unir.microbuscador.data;

import com.unir.microbuscador.model.pojo.Productosimple;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Productosimple, Long> {

List<Productosimple> findByProSimId (Long id);

}
