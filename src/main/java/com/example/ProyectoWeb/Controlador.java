package com.example.ProyectoWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @GetMapping("/")
    public String inicio(Model model) {
        return "login";
    }

    @GetMapping("/dashboard")
    public String inicio2(Model model) {
        return "dashboard";
    }

    @GetMapping("/analisis")
    public String inicio3(Model model) {
        return "analisis";
    }
}
