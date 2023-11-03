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
@Table(name="sig_distrito",schema="gis")
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_prov", nullable = true)
    private Integer codprov;

    @Column(name = "cod_dist", nullable = true)
    private Integer coddist;

    @Column(name = "nomb_dist", nullable = true)
    private String nomb_dist;

    @Column(name = "rgb_fill", nullable = true)
    private String rgbfill;

    @Column(name = "rgb_stroke", nullable = true)
    private String rgbstroke;

    @Column(name="geom",columnDefinition = "geometry(Polygon,4326)")
    private Geometry geom;
}
