package com.example.demo.controller;

import com.example.demo.service.ISubsectorService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subsectores")
public class SubsectorController {

    private ISubsectorService  subsectorService;

    public SubsectorController(ISubsectorService subs){
        this.subsectorService = subs;
    }

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<String>(subsectorService.getAll(), HttpStatus.OK);
    }


}
