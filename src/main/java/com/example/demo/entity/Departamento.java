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
@Table(name="sig_departamento",schema="gis")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_dep", nullable = true)
    private Integer coddep;

    @Column(name = "nomb_dep", nullable = true)
    private String nombdep;

    @Column(name = "capital_de", nullable = true)
    private String capitalde;

    @Column(name="geom",columnDefinition = "geometry(Polygon,4326)")
    private Geometry geom;
}
