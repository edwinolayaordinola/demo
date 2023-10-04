package com.example.demo.repository;

import com.example.demo.entity.ClienteGis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteGisRepo extends JpaRepository<ClienteGis,Integer> {
}
