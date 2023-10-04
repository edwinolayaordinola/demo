package com.example.demo.service.impl;

import com.example.demo.entity.ClienteGis;
import com.example.demo.repository.ClienteGisRepo;
import com.example.demo.service.IClienteGisService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteGisServiceImpl implements IClienteGisService {

    private ClienteGisRepo clienteGisRepo;

    public ClienteGisServiceImpl(ClienteGisRepo repo){
        this.clienteGisRepo = repo;
    }

    @Override
    public List<ClienteGis> getAll() {
        return clienteGisRepo.findAll();
    }
}
