package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Geometry;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="sig_clientes", schema="gis")
public class ClienteGis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name="cod_subsec",nullable = false)
    private Integer cod_subsec;

    @Column(name="cod_manz",nullable = false)
    private Integer cod_manz;

    @Column(name="cod_clie",nullable = false)
    private Integer cod_clie;

    @Column(name="sec_visita",nullable = false)
    private Integer sec_visita;

    @Column(name="sec_repart",nullable = false)
    private Integer sec_repart;

    @Column(name="geom",columnDefinition = "geometry(Point,4326)")
    private Geometry geom;

    @Column(name="longitud",nullable = false)
    private Float longitud;

    @Column(name="latitud",nullable = false)
    private Float latitud;
}
