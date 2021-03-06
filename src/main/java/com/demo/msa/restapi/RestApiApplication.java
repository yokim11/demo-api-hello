package com.demo.msa.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }

}
