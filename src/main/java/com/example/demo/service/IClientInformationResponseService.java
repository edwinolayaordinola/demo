package com.example.demo.service;

import com.example.demo.dto.ClientInformationResponse;

public interface IClientInformationResponseService {

    ClientInformationResponse get(String codigo);
}
