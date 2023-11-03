package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GastoVentaResponse {

    private Integer id;
    private String fecha;
    private String documento;
    private String serie;
    private String nro_doc;
    private String localidad;
    private String vendedor;
    private String nombre_v;
    private String cd_cliente;
    private String nm_cliente;
    private String direccion;
    private String sector;
    private String zona;
    private String ruta;
    private String secuencia;
    private String cd_negocio;
    private String ds_negocio;
    private String cd_tipocli;
    private String ds_tipocli;
    private String cd_linea;
    private String ds_linea;
    private String cd_grupo;
    private String ds_grupo;
    private String producto;
    private String descripcion;
    private String peso;
    private String pesototal;
    private String costointerno;
    private String costoi_total;
    private String cantidad;
    private String precio;
    private String total;
    private String bonificacion;
    private String costocompra;
    private String costocom_total;
    private String procen_comi;
    private String fecha_doc_afecta_nc;
    private String cd_doc_afecta_nc;
    private String descr_doc_afecta_nc;
    private String serie_doc_afecta_nc;
    private String nro_doc_afecta_nc;
}
