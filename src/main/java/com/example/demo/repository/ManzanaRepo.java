package com.example.demo.repository;

import com.example.demo.entity.Manzana;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManzanaRepo extends CrudRepository<Manzana,Integer> {

    @Query(value="select nomb_munic as etiqueta, ST_AsGeoJSON(geom) as geometry from sig_manzanas where geom is not null",nativeQuery = true)
    List<Object[]> getAll();
}
