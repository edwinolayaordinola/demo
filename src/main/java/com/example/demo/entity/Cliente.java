package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="clientes_activos",schema="public")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="cdgloc", nullable = false,length = 15)
    private String cdgloc;

    @Column(name="codigo", nullable = false,length = 15)
    private String codigo;

    @Column(name="nrodoc", nullable = false,length = 15)
    private String nrodoc;

    @Column(name="nombre", nullable = false,length = 150)
    private String nombre;

    @Column(name="direcf", nullable = false,length = 15)
    private String direcf;

    @Column(name="tipcli", nullable = false,length = 15)
    private String tipcli;

    @Column(name="tipo_clien", nullable = false,length = 15)
    private String tipo_clien;

    @Column(name="tipneg", nullable = false,length = 15)
    private String tipneg;

    @Column(name="tipo_nego", nullable = false,length = 15)
    private String tipo_nego;

    @Column(name="telef1", nullable = false,length = 15)
    private String telef1;

    @Column(name="telef2", nullable = false,length = 15)
    private String telef2;

    @Column(name="cdgsec", nullable = false,length = 15)
    private String cdgsec;

    @Column(name="cdgzon", nullable = false,length = 15)
    private String cdgzon;

    @Column(name="cdgrut", nullable = false,length = 15)
    private String cdgrut;

    @Column(name="cdgscc", nullable = false,length = 15)
    private String cdgscc;

    @Column(name="cdgvn1", nullable = false,length = 15)
    private String cdgvn1;

    @Column(name="vendedor", nullable = false,length = 150)
    private String vendedor;

    @Column(name="cdgdi1", nullable = false,length = 15)
    private String cdgdi1;

    @Column(name="diavisita", nullable = false,length = 15)
    private String diavisita;

    @Column(name="codubigeo", nullable = false,length = 15)
    private String codubigeo;

    @Column(name="fchcomp", nullable = false,length = 15)
    private String fchcomp;

    @Column(name="fching", nullable = false,length = 15)
    private String fching;

    @Column(name="mes", nullable = false,length = 15)
    private Integer mes;

    @Column(name="anio", nullable = false,length = 15)
    private Integer anio;

    @Column(name="periodo", nullable = false,length = 15)
    private String periodo;


}
