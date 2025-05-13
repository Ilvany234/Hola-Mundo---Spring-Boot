package com.ejemplo.Mi.proyecto.Spring.Boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "HOLA MUNDO!!!!!!";
    }

}
