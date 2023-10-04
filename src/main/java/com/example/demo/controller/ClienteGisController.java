package com.example.demo.controller;


import com.example.demo.entity.ClienteGis;
import com.example.demo.service.IClienteGisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientegis")
public class ClienteGisController {

    private IClienteGisService clienteGisService;

    public ClienteGisController(IClienteGisService cgisService){
        this.clienteGisService = cgisService;
    }

    @GetMapping
    public List<ClienteGis> getAll(){
        return clienteGisService.getAll();
    }
}
