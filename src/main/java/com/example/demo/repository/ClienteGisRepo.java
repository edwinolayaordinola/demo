package com.example.demo.repository;

import com.example.demo.entity.ClienteGis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ClienteGisRepo extends JpaRepository<ClienteGis,Integer> {

    @Query(value="select sc.cod_clie as codigo,ST_AsGeoJSON(sc.geom) as geometry,sc.nombre,sc.nrodoc,sc.direcf, sc.cod_sec as sector,sc.cod_subsec as subsector, sc.tipo_negocio as tiponegocio from gis.sig_clientes sc",nativeQuery = true)
    List<Object[]> getAll();

    @Query(value="select cl.* from gis.sig_clientes cl where cl.cod_clie=?1", nativeQuery = true)
    ClienteGis searchByCodigo(Integer codigo);

    @Query(value="select sc.cod_clie as codigo,ST_AsGeoJSON(sc.geom) as geometry,sc.nombre,sc.nrodoc,sc.direcf, sc.cod_sec as sector,sc.cod_subsec as subsector, sc.tipo_negocio as tiponegocio from gis.sig_clientes sc where sc.cod_sec=?1", nativeQuery = true)
    List<Object[]> searchBySec(Integer idSector);

    @Query(value="select sc.cod_clie as codigo,ST_AsGeoJSON(sc.geom) as geometry,sc.nombre,sc.nrodoc,sc.direcf, sc.cod_sec as sector,sc.cod_subsec as subsector, sc.tipo_negocio as tiponegocio from gis.sig_clientes sc where sc.tipo_negocio=?1", nativeQuery = true)
    List<Object[]> searchByTypeBusiness(String idTipoNegocio);

    @Transactional
    @Modifying
    @Query(value="insert into gis.sig_clientes(cod_clie, geom,cod_subsec,sec_visita,sec_repart) values(:codigo, ST_GeomFromText(:wkt),86,:secvisita,:secreparto)",nativeQuery = true)
    Integer agregar(@Param("codigo") String codigo, @Param("wkt") String wkt,@Param("secvisita") Integer secvisita,@Param("secreparto") Integer secreparto);
}
