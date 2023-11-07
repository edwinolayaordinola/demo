package com.example.demo.controller;


import com.example.demo.dto.ClienteGisRequest;
import com.example.demo.entity.ClienteGis;
import com.example.demo.service.IClienteGisService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteGisController {

    private IClienteGisService clienteGisService;

    Integer ENCONTRADO =2;
    public ClienteGisController(IClienteGisService cgisService){
        this.clienteGisService = cgisService;
    }

    @GetMapping("/clientesgis")
    public String getAll(){
        return clienteGisService.getAll();
    }

    @GetMapping("/clientesgis/sector/{idsector}")
    public String getBySector(@PathVariable Integer idsector){
        return clienteGisService.searchBySector(idsector);
    }

    @GetMapping("/clientesgis/tiponegocio/{tiponegocio}")
    public String getByTypeBusiness(@PathVariable String tiponegocio){
        return clienteGisService.searchByTypeBusiness(tiponegocio);
    }

    @PostMapping("/agregar")
    public Integer agregar(@RequestBody ClienteGisRequest clientegis){
        return clienteGisService.agregar(clientegis);
    }
}
