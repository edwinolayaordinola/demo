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
@Table(name="sig_provincia",schema="gis")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_dep", nullable = true)
    private Integer coddep;

    @Column(name = "cod_prov", nullable = true)
    private Integer codprov;

    @Column(name = "nomb_prov", nullable = true)
    private String nombprov;

    @Column(name = "capital_pr", nullable = true)
    private String capitalpr;

    @Column(name = "rgb_fill", nullable = true)
    private String rgbfill;

    @Column(name = "rgb_stroke", nullable = true)
    private String rgbstroke;

    @Column(name="geom",columnDefinition = "geometry(Polygon,4326)")
    private Geometry geom;
}
