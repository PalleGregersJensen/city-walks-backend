package org.example.citywalksbackend.repository;

import org.example.citywalksbackend.entity.CityTour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityTourRepository extends JpaRepository <CityTour, Integer> {
}
