package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ClientconnectApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

//    RestTemplate

    @RequestMapping("/member")
    String member() {
        final String uri = "http://localhost:6542/members";

        Member member = new Member ("Glenn", "Andersson", 21);


        RestTemplate restTemplate = new RestTemplate();
        Member result = restTemplate.postForObject( uri, member, Member.class);


        System.out.println(result);
        return "Person tillagd i listan!";
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientconnectApplication.class, args);
    }


}
