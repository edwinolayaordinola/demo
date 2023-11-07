package com.example.demo.service;

import com.example.demo.dto.ClienteGisRequest;
import com.example.demo.dto.ClienteGisResponse;
import com.example.demo.entity.Cliente;
import com.example.demo.entity.ClienteGis;

import java.util.List;

public interface IClienteGisService {

    String getAll();
    Integer agregar(ClienteGisRequest request);

    boolean searchByCodigo(Integer codigo);

    String searchBySector(Integer idSector);

    String searchByTypeBusiness(String idTipoNegocio);
}
