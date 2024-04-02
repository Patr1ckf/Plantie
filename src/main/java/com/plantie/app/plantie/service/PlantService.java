package com.plantie.app.plantie.service;

import com.plantie.app.plantie.exception.InvalidMoistureValueException;
import com.plantie.app.plantie.exception.PlantNotFoundException;
import com.plantie.app.plantie.model.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {

    private Plant plant = new Plant(0.0);

    public void updateMoisture(double moisture) {
        plant.setMoisture(moisture);
    }

    public double getMoisture() {
        if (plant == null) {
            throw new PlantNotFoundException("Plant not found!!!");
        }
        return plant.getMoisture();
    }

    public void validateMoistureValue(double moisture) {
        if (moisture < 0 || moisture > 100) {
            throw new InvalidMoistureValueException("Moisture value must be between 0 and 100");
        }
    }

}
