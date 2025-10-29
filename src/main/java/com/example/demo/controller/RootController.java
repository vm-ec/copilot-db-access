package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        return "Service is running. Endpoints: /employees, /employeeById/{id}, /pdProductById/{id}, /h2-console";
    }
}

