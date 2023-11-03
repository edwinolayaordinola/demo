package com.example.demo.repository;

import com.example.demo.entity.Cliente;
import com.example.demo.entity.GastoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GastoVentaRepository extends JpaRepository<GastoVenta,Integer> {

    @Query(value="select gv.* from public.gastoventa gv where gv.cd_cliente=?1",nativeQuery = true)
    List<GastoVenta> searchByCodigo(String codigo);
}
