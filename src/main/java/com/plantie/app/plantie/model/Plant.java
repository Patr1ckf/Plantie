package com.plantie.app.plantie.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import java.util.Objects;

//@Entity
public class Plant {

//    private @Id @GeneratedValue Long id;
    private double moisture;

    public Plant() {

    }

    public Plant(double moisture) {
        this.moisture = moisture;
    }

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

    @Override
    public String toString() {
        return "Plant{" +
                "moisture=" + moisture +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Plant plant = (Plant) o;
//        return Double.compare(moisture, plant.moisture) == 0 && Objects.equals(id, plant.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, moisture);
//    }
}
