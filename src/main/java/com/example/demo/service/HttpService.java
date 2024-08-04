package com.example.demo.service;

import com.example.demo.types.DeparturesResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class HttpService {

    public DeparturesResponse getList () throws Exception {
        String url = "https://transport.integration.sl.se/v1/sites/4305/departures?transport=BUS&line=474&direction=2";
        HttpRequest req = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(req, HttpResponse.BodyHandlers.ofString());
        String res = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        DeparturesResponse  list = objectMapper.readValue(res, DeparturesResponse.class);
        return list;
    }
}
