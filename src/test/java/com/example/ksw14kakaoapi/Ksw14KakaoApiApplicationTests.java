package com.example.ksw14kakaoapi;

import com.example.ksw14kakaoapi.model.HelloDTO;
import com.example.ksw14kakaoapi.service.HelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ksw14KakaoApiApplicationTests {

    @Autowired
    HelloServiceImpl helloService;

    @Test
    void contextLoads() {
        HelloDTO dto = helloService.sendMessage();
        System.out.println(dto.getResult_code());
    }

}
