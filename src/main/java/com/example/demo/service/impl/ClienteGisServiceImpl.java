package com.example.demo.service.impl;

import com.example.demo.dto.ClienteGisRequest;
import com.example.demo.entity.ClienteGis;
import com.example.demo.repository.ClienteGisRepo;
import com.example.demo.service.IClienteGisService;
import org.locationtech.jts.geom.Location;
import org.locationtech.jts.io.WKTReader;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteGisServiceImpl implements IClienteGisService {

    private ClienteGisRepo clienteGisRepo;

    public ClienteGisServiceImpl(ClienteGisRepo repo){
        this.clienteGisRepo = repo;
    }

    @Override
    public String getAll() {

        String cabecera = "{"
                + "\"type\": \"FeatureCollection\","
                + "\"features\": [";
        String cuerpoGeoJson="";
        String cola = "]}";
        List<Object[]> objects = clienteGisRepo.getAll();
        String geojson = getCuerpoJson(objects);
        cuerpoGeoJson = geojson.substring(0,geojson.length()-1);
        return cabecera + cuerpoGeoJson + cola;
    }

    @Override
    public Integer agregar(ClienteGisRequest request) {

        String wkt = "Point(" + request.getCoordx() + " " + request.getCoordy() +")";
        return clienteGisRepo.agregar(request.getCodigo(),wkt,request.getSecvisita(),request.getSecreparto());
    }

    @Override
    public boolean searchByCodigo(Integer codigo){
        ClienteGis cl =clienteGisRepo.searchByCodigo(codigo);
        if(cl!=null)
            return true;
        return false;
    }

    private String getCuerpoJson(List<Object[]> cgs){

        String cuerpoGeoJson = "";
        StringBuilder geojson = new StringBuilder();
        for (int i =0; i<cgs.size();i++){
            cuerpoGeoJson = "{"
                    + "\"type\": \"Feature\","
                    + "\"geometry\": " + cgs.get(i)[1].toString() + ","
                    + "\"properties\": {\"codigo\": " +  '"'+  cgs.get(i)[0].toString() + '"' +  "}"
                    + "},";
            geojson.append(cuerpoGeoJson);
        }
        return geojson.toString();
    }
}
