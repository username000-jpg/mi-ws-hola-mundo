package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Importamos las librerías necesarias para la web
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 1. Le decimos a Spring que esta clase responderá a peticiones web (REST)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // 2. Creamos la ruta (endpoint) del Web Service
    @GetMapping("/api/hola")
    public String saludar() {
        // Retornamos una respuesta en formato JSON
        return "{\"mensaje\": \"¡Hola Mundo desde mi primer Web Service en Java!\"}";
    }
}