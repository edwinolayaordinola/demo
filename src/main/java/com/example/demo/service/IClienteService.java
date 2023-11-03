package com.example.demo.service;

import com.example.demo.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> getAll();
    Cliente searchByCodigo(String codigo);
}
