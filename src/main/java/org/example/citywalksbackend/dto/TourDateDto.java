package org.example.citywalksbackend.dto;

import org.example.citywalksbackend.entity.CityTour;
import org.example.citywalksbackend.entity.TourDate;

import java.time.LocalDateTime;

public class TourDateDto {
    private int id;
    private int capacity;
    private LocalDateTime timeAndDate;
    private CityTour cityTour;

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

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public CityTour getCityTour() {
        return cityTour;
    }

    public void setCityTour(CityTour cityTour) {
        this.cityTour = cityTour;
    }

    public TourDateDto(TourDate t) {
        this.id = t.getId();
        this.capacity = t.getCapacity();
        this.timeAndDate = t.getTimeAndDate();
        this.cityTour = t.getCityTour();
    }

}
