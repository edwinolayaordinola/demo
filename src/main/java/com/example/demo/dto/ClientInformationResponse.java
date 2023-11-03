package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientInformationResponse {

    private ClienteResponse clienteResponse;
    private List<GastoVentaResponse> gastoVentaResponse;
}
