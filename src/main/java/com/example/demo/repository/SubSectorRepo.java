package com.example.demo.repository;

import com.example.demo.entity.Subsector;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubSectorRepo extends CrudRepository<Subsector,Integer> {

    @Query(value="select nomb_subse as etiqueta, ST_AsGeoJSON(geom) as geometry, rgb_fill,rgb_stroke from subsectores_corregido where geom is not null",nativeQuery = true)
    List<Object[]> getAll();
}
