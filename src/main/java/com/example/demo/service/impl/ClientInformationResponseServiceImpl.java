package com.example.demo.service.impl;

import com.example.demo.dto.ClientInformationResponse;
import com.example.demo.dto.ClienteResponse;
import com.example.demo.dto.GastoVentaResponse;
import com.example.demo.entity.Cliente;
import com.example.demo.service.IClientInformationResponseService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IGastoVentaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClientInformationResponseServiceImpl implements IClientInformationResponseService {

    private IGastoVentaService gastoVentaService;
    private IClienteService clienteService;

    public ClientInformationResponseServiceImpl(
            IGastoVentaService gastoVentaService,
            IClienteService clientService
    ) {
        this.gastoVentaService = gastoVentaService;
        this.clienteService = clientService;
    }

    @Override
    public ClientInformationResponse get(String codigo) {
        ClientInformationResponse response = new ClientInformationResponse();
        ClienteResponse clienteResponse = new ClienteResponse();
        List<GastoVentaResponse> gastos = new ArrayList<>();
        Cliente clien = clienteService.searchByCodigo(codigo);

        if(clien!=null){
            clienteResponse.setAnio(clien.getAnio());
            clienteResponse.setCdgloc(clien.getCdgloc());
            clienteResponse.setCdgrut(clien.getCdgrut());
            clienteResponse.setCdgsec(clien.getCdgsec());
            clienteResponse.setCdgscc(clien.getCdgscc());
            clienteResponse.setCdgzon(clien.getCdgzon());
            clienteResponse.setCodigo(clien.getCodigo());
            clienteResponse.setCodubigeo(clien.getCodubigeo());
            clienteResponse.setDiavisita(clien.getDiavisita());
            clienteResponse.setFchcomp(clien.getFchcomp());
            clienteResponse.setDirecf(clien.getDirecf());
            clienteResponse.setMes(clien.getMes());
            clienteResponse.setFching(clien.getFching());
            clienteResponse.setNombre(clien.getNombre());
            clienteResponse.setNrodoc(clien.getNrodoc());
            clienteResponse.setPeriodo(clien.getPeriodo());
            clienteResponse.setTipcli(clien.getTipcli());
            clienteResponse.setTipneg(clien.getTipneg());
            clienteResponse.setVendedor(clien.getVendedor());
            clienteResponse.setCdgdi1(clien.getCdgdi1());
            clienteResponse.setTipo_clien(clien.getTipo_clien());
            clienteResponse.setTipo_nego(clien.getTipo_nego());
            clienteResponse.setTelef1(clien.getTelef1());
            clienteResponse.setTelef2(clien.getTelef2());
            clienteResponse.setCdgvn1(clien.getCdgvn1());
            clienteResponse.setId(clien.getId());

            gastoVentaService.searchByCodigo(codigo).forEach(data ->{
                GastoVentaResponse dto = new GastoVentaResponse();
                dto.setFecha(data.getFecha());
                dto.setDocumento(data.getDocumento());
                dto.setSerie(data.getSerie());
                dto.setNro_doc(data.getNro_doc());
                dto.setLocalidad(data.getLocalidad());
                dto.setVendedor(data.getVendedor());
                dto.setNombre_v(data.getNombre_v());
                dto.setCd_cliente(data.getCd_cliente());
                dto.setNm_cliente(data.getNm_cliente());
                dto.setDireccion(data.getDireccion());
                dto.setSector(data.getSector());
                dto.setZona(data.getZona());
                dto.setRuta(data.getRuta());
                dto.setSecuencia(data.getSecuencia());
                dto.setCd_negocio(data.getCd_negocio());
                dto.setDs_negocio(data.getDs_negocio());
                dto.setCd_tipocli(data.getCd_tipocli());
                dto.setDs_tipocli(data.getDs_tipocli());
                dto.setCd_linea(data.getCd_linea());
                dto.setDs_linea(data.getDs_linea());
                dto.setCd_grupo(data.getCd_grupo());
                dto.setDs_grupo(data.getDs_grupo());
                dto.setProducto(data.getProducto());
                dto.setDescripcion(data.getDescripcion());
                dto.setPeso(data.getPeso());
                dto.setPesototal(data.getPesototal());
                dto.setCostointerno(data.getCostointerno());
                dto.setCostoi_total(data.getCostoi_total());
                dto.setCantidad(data.getCantidad());
                dto.setPrecio(data.getPrecio());
                dto.setTotal(data.getTotal());
                dto.setBonificacion(data.getBonificacion());
                dto.setCostocompra(data.getCostocompra());
                dto.setCostocom_total(data.getCostocom_total());
                dto.setProcen_comi(data.getProcen_comi());
                dto.setFecha_doc_afecta_nc(data.getFecha_doc_afecta_nc());
                dto.setCd_doc_afecta_nc(data.getCd_doc_afecta_nc());
                dto.setDescr_doc_afecta_nc(data.getDescr_doc_afecta_nc());
                dto.setSerie_doc_afecta_nc(data.getSerie_doc_afecta_nc());
                dto.setNro_doc_afecta_nc(data.getNro_doc_afecta_nc());
                dto.setId(data.getId());
                gastos.add(dto);
            });
            response.setClienteResponse(clienteResponse);
            response.setGastoVentaResponse(gastos);
        }
        return response;
    }
}
