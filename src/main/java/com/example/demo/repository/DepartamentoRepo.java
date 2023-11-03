package com.example.demo.repository;

import com.example.demo.entity.Departamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepo extends CrudRepository<Departamento,Integer> {

    @Query(value="select nomb_dep as etiqueta, ST_AsGeoJSON(geom) as geometry from sig_departamento where geom is not null",nativeQuery = true)
    List<Object[]> getAll();
}
