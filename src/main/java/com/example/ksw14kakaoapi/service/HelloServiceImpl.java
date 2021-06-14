package com.example.ksw14kakaoapi.service;

import com.example.ksw14kakaoapi.model.HelloDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService{

    private static final String API_KEY = "b913373b526049e13b08ee40e8a65c70";

    private static final String HOST = "https://kapi.kakao.com";
    private static final String SEND_TO_ME = "/v2/api/talk/memo/send";
    private static final String SEND_DATA = "?template_id=55184";


    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public static <T> HttpEntity<T> setHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/x-www-form-urlencoded");
        headers.set("Authorization","Bearer "+API_KEY);

        return new HttpEntity<T>(headers);
    }

    @Override
    public HelloDTO sendMessage(){
        RestTemplate restTemplate = restTemplateBuilder.build();

        HttpEntity<HelloDTO> httpEntity = setHeaders();
        ResponseEntity<HelloDTO> responseEntity
                = restTemplate.exchange(HOST+SEND_TO_ME+SEND_DATA, HttpMethod.POST,httpEntity,HelloDTO.class);

        return responseEntity.getBody();
    }
}
