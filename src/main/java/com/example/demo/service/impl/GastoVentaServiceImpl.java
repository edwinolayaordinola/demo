package com.example.demo.service.impl;

import com.example.demo.entity.GastoVenta;
import com.example.demo.repository.GastoVentaRepository;
import com.example.demo.service.IGastoVentaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoVentaServiceImpl implements IGastoVentaService {

    GastoVentaRepository repo;

    public GastoVentaServiceImpl(GastoVentaRepository repositorio){
        this.repo = repositorio;
    }

    @Override
    public List<GastoVenta> searchByCodigo(String codigo) {
        return repo.searchByCodigo(codigo);
    }
}
