package com.example.demo.controller;

import com.example.demo.service.IProvinciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController {

    private IProvinciaService provinciaService;

    public  ProvinciaController(IProvinciaService prov){
        this.provinciaService = prov;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(provinciaService.getAll(), HttpStatus.OK);
    }
}
