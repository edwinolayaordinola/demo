package com.example.demo.service.impl;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona agregar(Persona p) {
        return personaRepository.save(p);
    }
}
