package com.example.demo.service;

import com.example.demo.entity.GastoVenta;

import java.util.List;

public interface IGastoVentaService {

    List<GastoVenta> searchByCodigo(String codigo);
}
