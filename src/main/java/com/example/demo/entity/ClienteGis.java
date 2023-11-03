package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.locationtech.jts.geom.Geometry;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="sig_clientes", schema="gis")
public class ClienteGis{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name="cod_subsec",nullable = true, columnDefinition = "INTEGER DEFAULT 0")
    private Integer codsubsec;

    @Column(name="cod_manz",nullable = true, columnDefinition = "INTEGER DEFAULT 0")
    private Integer codmanz;

    @Column(name="cod_clie",nullable = false)
    private String codclie;

    @Column(name="sec_visita",nullable = true, columnDefinition = "INTEGER DEFAULT 0")
    private Integer secvisita;

    @Column(name="sec_repart",nullable = true, columnDefinition = "INTEGER DEFAULT 0")
    private Integer secrepart;

    @Column(name="geom",columnDefinition = "geometry(Point,4326)",nullable = true)
    private Geometry geom;

    @Column(name="longitud",nullable = true, columnDefinition = "FLOAT DEFAULT 0.0")
    private Float longitud;

    @Column(name="latitud",nullable = true,  columnDefinition = "FLOAT DEFAULT 0.0")
    private Float latitud;

    @Column(name="fecha_registro",nullable = true,  columnDefinition = "TIMESTAMP DEFAULT now()")
    private LocalDateTime fechaRegistro;
}
