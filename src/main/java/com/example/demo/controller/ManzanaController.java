package com.example.demo.controller;


import com.example.demo.service.IManzanaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manzanas")
public class ManzanaController {

    private IManzanaService manzanaService;

    public ManzanaController(IManzanaService mservice){
        this.manzanaService = mservice;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(manzanaService.getAll(),HttpStatus.OK);
    }
}
