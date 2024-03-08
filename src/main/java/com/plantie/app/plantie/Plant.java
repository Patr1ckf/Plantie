package com.plantie.app.plantie;

public class Plant {
    private double moisture;


    public Plant(double moisture) {
        this.moisture = moisture;
    }

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "moisture=" + moisture +
                '}';
    }
}
