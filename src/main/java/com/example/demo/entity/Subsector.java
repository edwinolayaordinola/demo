package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Geometry;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="subsectores_corregido",schema="gis")
public class Subsector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_sector", nullable = true)
    private Integer codsector;

    @Column(name = "cod_subsec", nullable = true)
    private String codsubsec;

    @Column(name = "nomb_subse", nullable = true)
    private String nombsubse;

    @Column(name = "clie_subse", nullable = true)
    private String cliesubse;

    @Column(name = "rgb_fill", nullable = true)
    private String rgbfill;

    @Column(name = "rgb_stroke", nullable = true)
    private String rgbstroke;

    @Column(name="geom",columnDefinition = "geometry(MultiPolygon,4326)")
    private Geometry geom;
}
