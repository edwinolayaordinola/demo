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

    @Override
    public String searchBySector(Integer idSector) {
        String cabecera = "{"
                + "\"type\": \"FeatureCollection\","
                + "\"features\": [";
        String cuerpoGeoJson="";
        String cola = "]}";
        List<Object[]> objects = clienteGisRepo.searchBySec(idSector);
        String geojson = getCuerpoJson(objects);
        if(geojson.length()>0)
            cuerpoGeoJson = geojson.substring(0,geojson.length()-1);
        return cabecera + cuerpoGeoJson + cola;
    }

    @Override
    public String searchByTypeBusiness(String idTipoNegocio) {
        String cabecera = "{"
                + "\"type\": \"FeatureCollection\","
                + "\"features\": [";
        String cuerpoGeoJson="";
        String cola = "]}";
        List<Object[]> objects = clienteGisRepo.searchByTypeBusiness(idTipoNegocio);
        String geojson = getCuerpoJson(objects);
        if(geojson.length()>0)
            cuerpoGeoJson = geojson.substring(0,geojson.length()-1);
        return cabecera + cuerpoGeoJson + cola;
    }

    private String getCuerpoJson(List<Object[]> cgs){

        String cuerpoGeoJson = "";
        StringBuilder geojson = new StringBuilder();
        for (int i =0; i<cgs.size();i++){
            cuerpoGeoJson = "{"
                    + "\"type\": \"Feature\","
                    + "\"geometry\": " + cgs.get(i)[1].toString() + ","
                    + "\"properties\": {\"codigo\": " +  "\"" +  cgs.get(i)[0].toString() + "\"" + ","
                    + "\"nombre\":" + "\"" + cgs.get(i)[2].toString() + "\"" + ","
                    + "\"nrodoc\":" + "\"" + cgs.get(i)[3].toString() + "\"" + ","
                    + "\"direcf\":" + "\"" + cgs.get(i)[4].toString() + "\"" + ","
                    + "\"sector\":" + "\"" + cgs.get(i)[5].toString() + "\"" + ","
                    + "\"subsector\":" + "\"" + cgs.get(i)[6].toString() + "\"" + ","
                    + "\"tiponegocio\":" + "\"" + cgs.get(i)[7].toString() + "\"" + "}"
                    + "},";
            geojson.append(cuerpoGeoJson);
        }
        return geojson.toString();
    }
}
