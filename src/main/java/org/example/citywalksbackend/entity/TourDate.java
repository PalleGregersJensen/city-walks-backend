package org.example.citywalksbackend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TourDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime timeAndDate;
    private int capacity;
    @ManyToOne
    @JoinColumn(name = "city_tour_id")
    private CityTour cityTour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public CityTour getCityTour() {
        return cityTour;
    }

    public void setCityTour(CityTour cityTour) {
        this.cityTour = cityTour;
    }
}
