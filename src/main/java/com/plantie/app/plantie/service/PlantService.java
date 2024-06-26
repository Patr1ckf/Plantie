package com.plantie.app.plantie.service;

import com.plantie.app.plantie.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {

    private final Plant plant;
    private final EmailService emailService;
    private boolean sent = false; // 1-sent; 0-not sent

    @Autowired
    public PlantService(Plant plant, EmailService emailService) {
        this.plant = plant;
        this.emailService = emailService;
    }

    public void validateMoistureValue(double moisture) {
        if (moisture < 0 || moisture > 100) {
            throw new IllegalArgumentException("Moisture value must be between 0 and 100!");}
    }

    public void updateMoisture(double moisture) {
        validateMoistureValue(moisture);
        plant.setMoisture(moisture);
        if(!plant.getEmail().isEmpty()){
            checkMoistureAndAlert();
        }
    }

    public double getMoisture() {
        return plant.getMoisture();
    }

    public void checkMoistureAndAlert() {
        if (plant.getMoisture() < plant.getMinMoisture()) {
            if(!sent){
                emailService.sendEmail(
                        plant.getEmail(),
                        "Water me :((",
                        "Hey there, it's your " + plant.getName() + " speaking!\nMy soil moisture is only at " + plant.getMoisture() + " %, mind giving me a drink? \uD83C\uDF3F"
                );
                sent = true;
            }
        }
        else{
            sent = false;
        }
    }
}
