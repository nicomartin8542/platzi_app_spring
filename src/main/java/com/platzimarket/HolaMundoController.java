package com.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/saludar")
@RestController
public class HolaMundoController {

    @GetMapping("hola")
    public Object saludar() {
        return "sabelo";
    }
}



