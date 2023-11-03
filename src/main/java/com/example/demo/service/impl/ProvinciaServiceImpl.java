package com.example.demo.service.impl;

import com.example.demo.repository.ProvinciaRepo;
import com.example.demo.service.IProvinciaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements IProvinciaService {

    private ProvinciaRepo repo;

    public ProvinciaServiceImpl(ProvinciaRepo prov){
        this.repo = prov;
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
                    + "\"geometry\": " + cgs.get(i)[1].toString()+ ","
                    + "\"properties\": {\"etiqueta\":" + "\""+cgs.get(i)[0].toString() + "\"" + ","
                    + "\"rgb_fill\":" + "\""+cgs.get(i)[2].toString() + "\"" + ","
                    + "\"rgb_stroke\":" + "\""+cgs.get(i)[3].toString() + "\"" + "}"
                    + "},";
            geojson.append(cuerpoGeoJson);
        }
        return geojson.toString();
    }
}
