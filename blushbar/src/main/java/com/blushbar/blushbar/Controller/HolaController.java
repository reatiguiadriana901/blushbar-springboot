package com.blushbar.blushbar.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @Value("${blushbar.mensaje}")
    private String mensaje;

    @GetMapping("/hola")
    public String hola() {
        return mensaje;
    }
}