package com.example.demo.controller;

import com.example.demo.service.IDepartamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private IDepartamentoService departamentoService;

    public DepartamentoController(IDepartamentoService ds){
        this.departamentoService = ds;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(departamentoService.getAll(), HttpStatus.OK);
    }


}
