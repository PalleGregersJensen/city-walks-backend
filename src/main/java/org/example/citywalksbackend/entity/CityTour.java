package org.example.citywalksbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CityTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //private int capacity;
    private String guide;
    private Double price;
    private String nameOfTour;
    private Double distanceOfTour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameOfTour() {
        return nameOfTour;
    }

    public void setNameOfTour(String nameOfTour) {
        this.nameOfTour = nameOfTour;
    }

    public double getDistanceOfTour() {
        return distanceOfTour;
    }

    public void setDistanceOfTour(double distanceOfTour) {
        this.distanceOfTour = distanceOfTour;
    }
}
