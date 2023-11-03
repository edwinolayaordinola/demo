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
@Table(name="sig_manzanas",schema="gis")
public class Manzana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name = "cod_subsec", nullable = true)
    private Integer codsubsec;

    @Column(name = "cod_manz", nullable = true)
    private Integer codmanz;

    @Column(name = "nomb_munic", nullable = true)
    private String nombmunic;

    @Column(name="geom",columnDefinition = "geometry(Polygon,4326)")
    private Geometry geom;

}
