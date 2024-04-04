package org.example.citywalksbackend.dto;

import org.example.citywalksbackend.entity.CityTour;

public class CityTourDto {
    private int id;
    private int capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNameOfTour() {
        return nameOfTour;
    }

    public void setNameOfTour(String nameOfTour) {
        this.nameOfTour = nameOfTour;
    }

    public Double getDistanceOfTour() {
        return distanceOfTour;
    }

    public void setDistanceOfTour(Double distanceOfTour) {
        this.distanceOfTour = distanceOfTour;
    }

    public CityTourDto(CityTour c) {
        this.id = c.getId();
        this.nameOfTour = c.getNameOfTour();
        this.capacity = c.getCapacity();
        this.price = c.getPrice();
        this.distanceOfTour = c.getDistanceOfTour();
        this.guide = c.getGuide();
    }

}