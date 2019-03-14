package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClientRequest {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

//    RestTemplate

    @RequestMapping("/persons")
    String createPerson() {

        final String uri = "http://localhost:9100/persons";

        PersonMould personMould = new PersonMould("Mange", "Larsson", 76);


        RestTemplate restTemplate = new RestTemplate();
        // PersonMould result = restTemplate.postForObject( uri, personMould, PersonMould.class);
        restTemplate.postForObject( uri, personMould, PersonMould.class);

        //System.out.println(result);
       return "Person tillagd i listan!";
    }
}
