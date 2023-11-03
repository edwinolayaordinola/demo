package com.example.demo.service.impl;

import com.example.demo.repository.DepartamentoRepo;
import com.example.demo.service.IDepartamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    private DepartamentoRepo repo;

    public DepartamentoServiceImpl(DepartamentoRepo dep){
        this.repo = dep;
    }

    @Override
    public String getAll() {
        String cabecera = "{"
                + "\"type\": \"FeatureCollection\","
                + "\"features\": [";
        String cuerpoGeoJson="";
        String cola = "]}";
        List<Object[]> objects = repo.getAll();
        String geojson = getCuerpoJson(objects);
        cuerpoGeoJson = geojson.substring(0,geojson.length()-1);
        return cabecera + cuerpoGeoJson + cola;
    }

    private String getCuerpoJson(List<Object[]> cgs){
        String cuerpoGeoJson = "";
        StringBuilder geojson = new StringBuilder();
        for (int i =0; i<cgs.size();i++){
            cuerpoGeoJson = "{"
                    + "\"type\": \"Feature\","
                    + "\"geometry\": " + cgs.get(i)[1].toString() //+ ","
                    //+ "\"properties\": {\"nomb_munic\":" + (cgs.get(i)[0]!=null?cgs.get(i)[0].toString():"\"no tiene\":") + "}"
                    + "},";
            geojson.append(cuerpoGeoJson);
        }
        return geojson.toString();
    }
}
