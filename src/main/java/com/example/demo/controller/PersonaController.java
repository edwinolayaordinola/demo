package com.example.demo.controller;


import com.example.demo.dto.ClienteGisRequest;
import com.example.demo.entity.ClienteGis;
import com.example.demo.entity.Persona;
import com.example.demo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    @PostMapping("/agregar")
    public Persona agregar(@RequestBody Persona p){
        Persona per = personaService.agregar(p);
        //return new ResponseEntity<ClienteGis>(cl , HttpStatus.OK);
        return per;
    }
}
