package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteGisRequest {

    private String codigo;
    private Float coordx;
    private Float coordy;
    private Integer secvisita;
    private Integer secreparto;
}
