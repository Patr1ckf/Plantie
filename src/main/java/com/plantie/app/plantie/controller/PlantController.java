package com.plantie.app.plantie.controller;

import com.plantie.app.plantie.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlantController {

    private final PlantService plantService;

    @Autowired
    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @PutMapping("/plant")
    public String updateMoisture(@RequestBody double moisture) {
        plantService.validateMoistureValue(moisture);
        plantService.updateMoisture(moisture);
        return "Moisture data updated successfully";
    }

    @GetMapping("/plant")
    public double getMoisture() {
        return plantService.getMoisture();
    }
}
