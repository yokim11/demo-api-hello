package com.demo.msa.restapi.controller.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "V2, Hello World!";
    }
}
