package com.example.demo.repository;

import com.example.demo.entity.Distrito;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistritoRepo extends CrudRepository<Distrito,Integer> {

    @Query(value="select nomb_dist as etiqueta, ST_AsGeoJSON(geom) as geometry, rgb_fill,rgb_stroke from sig_distrito where geom is not null",nativeQuery = true)
    List<Object[]> getAll();
}
