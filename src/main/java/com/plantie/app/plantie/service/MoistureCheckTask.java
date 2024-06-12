package com.plantie.app.plantie.service;

import com.plantie.app.plantie.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MoistureCheckTask {

    private final PlantService plantService;
    private final Plant plant;

    @Autowired
    public MoistureCheckTask(PlantService plantService, Plant plant) {
        this.plantService = plantService;
        this.plant =plant;
    }

    @Scheduled(fixedRate = 5000)
    public void checkMoisture() {
        if(!plant.getEmail().isEmpty()){
            plantService.checkMoistureAndAlert();
        }

    }
}
