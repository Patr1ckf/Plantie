package com.plantie.app.plantie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlantieApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlantieApplication.class, args);
    }

}
