package com.example.demo.controller;

import com.example.demo.dto.ClientInformationResponse;
import com.example.demo.service.IClientInformationResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class ClientInformationController {


    IClientInformationResponseService service;

    public ClientInformationController(IClientInformationResponseService s){
        this.service = s;
    }

    @GetMapping("/clientesinformation/{codigo}")
    public ResponseEntity<ClientInformationResponse> get(@PathVariable String codigo){
        ClientInformationResponse response = service.get(codigo);
        return new ResponseEntity<ClientInformationResponse>(response, HttpStatus.OK);
    }


}
