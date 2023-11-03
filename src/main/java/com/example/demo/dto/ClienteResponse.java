package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private Integer id;
    private String cdgloc;
    private String codigo;
    private String nrodoc;
    private String nombre;
    private String direcf;
    private String tipcli;
    private String tipo_clien;
    private String tipneg;
    private String tipo_nego;
    private String telef1;
    private String telef2;
    private String cdgsec;
    private String cdgzon;
    private String cdgrut;
    private String cdgscc;
    private String cdgvn1;
    private String vendedor;
    private String cdgdi1;
    private String diavisita;
    private String codubigeo;
    private String fchcomp;
    private String fching;
    private Integer mes;
    private Integer anio;
    private String periodo;
}
