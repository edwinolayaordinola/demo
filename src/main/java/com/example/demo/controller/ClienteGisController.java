package com.example.demo.controller;


import com.example.demo.dto.ClienteGisRequest;
import com.example.demo.entity.ClienteGis;
import com.example.demo.service.IClienteGisService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientesgis")
public class ClienteGisController {

    private IClienteGisService clienteGisService;

    Integer ENCONTRADO =2;
    public ClienteGisController(IClienteGisService cgisService){
        this.clienteGisService = cgisService;
    }

    @GetMapping
    public String getAll(){
        return clienteGisService.getAll();
    }

    @PostMapping("/agregar")
    public Integer agregar(@RequestBody ClienteGisRequest clientegis){
        /*if(clienteGisService.searchByCodigo((clientegis.getCodigo())))
            return ENCONTRADO;*/
        return clienteGisService.agregar(clientegis);
    }
}
