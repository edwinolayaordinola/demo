package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="gastoventa",schema="public")
public class GastoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="fecha", nullable = false,length = 15)
    private String fecha;

    @Column(name="documento", nullable = true)
    private String documento;

    @Column(name="serie", nullable = true)
    private String serie;

    @Column(name="nro_doc", nullable = true)
    private String nro_doc;

    @Column(name="localidad", nullable = true)
    private String localidad;

    @Column(name="vendedor", nullable = true)
    private String vendedor;

    @Column(name="nombre_v", nullable = true)
    private String nombre_v;

    @Column(name="cd_cliente", nullable = true)
    private String cd_cliente;

    @Column(name="nm_cliente", nullable = true)
    private String nm_cliente;

    @Column(name="direccion", nullable = true)
    private String direccion;

    @Column(name="sector", nullable = true)
    private String sector;

    @Column(name="zona", nullable = true)
    private String zona;

    @Column(name="ruta", nullable = true)
    private String ruta;

    @Column(name="secuencia", nullable = true)
    private String secuencia;

    @Column(name="cd_negocio", nullable = true)
    private String cd_negocio;

    @Column(name="ds_negocio", nullable = true)
    private String ds_negocio;

    @Column(name="cd_tipocli", nullable = true)
    private String cd_tipocli;

    @Column(name="ds_tipocli", nullable = true)
    private String ds_tipocli;

    @Column(name="cd_linea", nullable = true)
    private String cd_linea;

    @Column(name="ds_linea", nullable = true)
    private String ds_linea;

    @Column(name="cd_grupo", nullable = true)
    private String cd_grupo;

    @Column(name="ds_grupo", nullable = true)
    private String ds_grupo;

    @Column(name="producto", nullable = true)
    private String producto;

    @Column(name="descripcion", nullable = true)
    private String descripcion;

    @Column(name="peso", nullable = true)
    private String peso;

    @Column(name="pesototal", nullable = true)
    private String pesototal;

    @Column(name="costointerno", nullable = true)
    private String costointerno;

    @Column(name="costoi_total", nullable = true)
    private String costoi_total;

    @Column(name="cantidad", nullable = true)
    private String cantidad;

    @Column(name="precio", nullable = true)
    private String precio;

    @Column(name="total", nullable = true)
    private String total;

    @Column(name="bonificacion", nullable = true)
    private String bonificacion;

    @Column(name="costocompra", nullable = true)
    private String costocompra;

    @Column(name="costocom_total", nullable = true)
    private String costocom_total;

    @Column(name="proce_comi", nullable = true)
    private String procen_comi;

    @Column(name="fecha_doc_afecta_nc", nullable = true)
    private String fecha_doc_afecta_nc;

    @Column(name="cd_doc_afecta_nc", nullable = true)
    private String cd_doc_afecta_nc;

    @Column(name="descr_doc_afecta_nc", nullable = true)
    private String descr_doc_afecta_nc;

    @Column(name="serie_doc_afecta_nc", nullable = true)
    private String serie_doc_afecta_nc;

    @Column(name="nro_doc_afecta_nc", nullable = true)
    private String nro_doc_afecta_nc;
}
