package com.example.demo.repository;

import com.example.demo.entity.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepo extends CrudRepository<Provincia,Integer> {

    @Query(value="select nomb_prov as etiqueta, ST_AsGeoJSON(geom) as geometry, rgb_fill,rgb_stroke from sig_provincia where geom is not null",nativeQuery = true)
    List<Object[]> getAll();
}
