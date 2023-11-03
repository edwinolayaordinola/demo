package com.example.demo.controller;

import com.example.demo.entity.GastoVenta;
import com.example.demo.service.IGastoVentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gastosventas")
public class GastoVentaController {

    private IGastoVentaService service;

    public GastoVentaController(IGastoVentaService s){
        this.service = s;
    }

    @GetMapping("/codigo")
    public ResponseEntity<List<GastoVenta>> getByCodigo(@RequestParam String codigo){
        List<GastoVenta> gastosporventas = service.searchByCodigo(codigo);
        return new ResponseEntity<List<GastoVenta>>(gastosporventas, HttpStatus.OK);
    }
}
