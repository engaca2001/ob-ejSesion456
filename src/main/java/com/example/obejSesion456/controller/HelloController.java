package com.example.obejSesion456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/saludo")
    public String saludar(){

        return "HOlA, qué tal estás hoy en Jerez?";

    }
}
