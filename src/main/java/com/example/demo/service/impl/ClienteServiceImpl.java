package com.example.demo.service.impl;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepo;
import com.example.demo.service.IClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    private ClienteRepo clienteRepo;

    public ClienteServiceImpl(ClienteRepo crepo){
        this.clienteRepo = crepo;
    }

    @Override
    public List<Cliente> getAll() {
        return clienteRepo.findAll().stream().limit(10).toList();
    }
}
