package com.plantie.app.plantie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MoistureCheckTask {

    private final PlantService plantService;

    @Autowired
    public MoistureCheckTask(PlantService plantService) {
        this.plantService = plantService;
    }

    @Scheduled(fixedRate = 5000) // Check every 5 seconds
    public void checkMoisture() {
        plantService.checkMoistureAndAlert();
    }
}
