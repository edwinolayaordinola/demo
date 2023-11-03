package com.example.demo.controller;

import com.example.demo.entity.Sector;
import com.example.demo.service.ISectorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sectores")
public class SectorController {

    private ISectorService sectorService;

    public SectorController(ISectorService ss){
        this.sectorService = ss;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(sectorService.getAll(), HttpStatus.OK);
    }

}
