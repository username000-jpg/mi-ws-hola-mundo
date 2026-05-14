package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Importamos las librerías para manejar el Diccionario (Map) y las Fechas
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController 
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/api/hola")
    public Map<String, Object> saludar() {
        // Creamos una estructura de datos clave-valor
        Map<String, Object> respuesta = new HashMap<>();
        
        respuesta.put("estado", "éxito");
        respuesta.put("codigo", 200);
        respuesta.put("mensaje", "¡Hola Mundo! Este es mi primer Web Service en Java.");
        
        // Obtenemos la fecha actual y le damos el formato de la imagen
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraActual = LocalDateTime.now().format(formato);
        respuesta.put("fecha_hora", fechaHoraActual);
        
        respuesta.put("tecnologia", "Java Spring Boot");

        // Retornamos el Map. Spring Boot lo convertirá mágicamente a un JSON estructurado.
        return respuesta;
    }
}
