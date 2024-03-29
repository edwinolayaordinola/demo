package com.example.demo.repository;

import com.example.demo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

    @Query(value="select cl_a.* from public.clientes_activos cl_a where cl_a.codigo=?1",nativeQuery = true)
    Cliente searchByCodigo(String codigo);

}
