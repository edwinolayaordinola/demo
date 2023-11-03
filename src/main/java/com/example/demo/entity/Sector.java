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
@Table(name="sig_sectores",schema="gis")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_prov", nullable = true)
    private Integer codprov;

    @Column(name = "cod_sector", nullable = true)
    private Integer codsector;

    @Column(name = "nomb_sect", nullable = true)
    private String nombsect;

    @Column(name = "clie_sect", nullable = true)
    private Integer cliesector;

    @Column(name = "d_visita", nullable = true)
    private String dvisita;

    @Column(name = "d_reparto", nullable = true)
    private String dreparto;

    @Column(name = "rgb_fill", nullable = true)
    private String rgbfill;

    @Column(name = "rgb_stroke", nullable = true)
    private String rgbstroke;

    @Column(name="geom",columnDefinition = "geometry(Polygon,4326)")
    private Geometry geom;
}
