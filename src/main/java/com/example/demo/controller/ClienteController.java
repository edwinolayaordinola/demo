package com.example.demo.controller;

import com.example.demo.entity.Cliente;
import com.example.demo.service.IClienteService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private IClienteService clienteService;

    public ClienteController(IClienteService cservice){
        this.clienteService = cservice;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll(){
        List<Cliente> clientes = clienteService.getAll();
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    @GetMapping("/clientes/{codigo}")
    public ResponseEntity<Cliente> searchByCodigo(@PathVariable String codigo){
        Cliente cl = clienteService.searchByCodigo(codigo);
        return new ResponseEntity<Cliente>(cl, HttpStatus.OK);
    }
}
