package com.example.demo.controller;


import com.example.demo.service.IDistritoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

    private IDistritoService distritoService;

    public DistritoController(IDistritoService dist){
        this.distritoService = dist;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(distritoService.getAll(), HttpStatus.OK);
    }
}
