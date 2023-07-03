package com.mancera.imali.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prueba {


    @GetMapping("/prueba")
    public String getTodo() {
        return "prueba";
    }
}
