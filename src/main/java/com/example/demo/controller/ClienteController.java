package com.example.demo.controller;

import com.example.demo.entity.Cliente;
import com.example.demo.service.IClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private IClienteService clienteService;

    public ClienteController(IClienteService cservice){
        this.clienteService = cservice;
    }

    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getAll();
    }
}
