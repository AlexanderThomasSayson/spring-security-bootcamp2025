package com.srllc.spring_security_bootcamp2025.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping
    public String testEndpoint(){
        return "This is a sample endpoint!";
    }
}
