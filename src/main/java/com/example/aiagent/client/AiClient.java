package com.example.aiagent.client;

import jakarta.el.BeanELResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


@Component
public class AiClient {


    private final RestTemplate restTemplate = new RestTemplate();

    public String generate(String message){
        String url = "http://localhost:11434/api/generate";



        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);


        Map<String , Object> requestBody =new HashMap<>();

        requestBody.put("model" , "llama3");
        requestBody.put("prompt", message);
        requestBody.put("stream", false);



        HttpEntity<Map<String , Object>> entity= new HttpEntity<>(requestBody , headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(url , entity , Map.class);



        return response.getBody().get("response").toString();


    }



}
