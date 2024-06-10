package com.plantie.app.plantie.model;

import org.springframework.stereotype.Component;

@Component
public class Plant {
    private double moisture = 70.0;
    private String name = "My Plant";
    private String email = "";
    private double minMoisture = 0.0;

    public Plant() {
    }

    public Plant(String name, double moisture, String email) {
        this.name = name;
        this.moisture = moisture;
        this.email = email;
    }

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinMoisture() {
        return minMoisture;
    }

    public void setMinMoisture(double minMoisture) {
        this.minMoisture = minMoisture;
    }
    @Override
    public String toString() {
        return "Plant{" +
                "moisture=" + moisture +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", minMoisture=" + minMoisture +
                '}';
    }

}
