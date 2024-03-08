package com.plantie.app.plantie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PlantieApplication {

    @GetMapping("/index")
    public String message(){
        return "Hi!";
    }

    public static void main(String[] args) {
        SpringApplication.run(PlantieApplication.class, args);
    }

}
