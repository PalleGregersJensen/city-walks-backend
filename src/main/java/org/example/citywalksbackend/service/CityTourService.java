package org.example.citywalksbackend.service;

import org.example.citywalksbackend.dto.CityTourDto;
import org.example.citywalksbackend.entity.CityTour;
import org.example.citywalksbackend.repository.CityTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityTourService {
    @Autowired
    CityTourRepository cityTourRepository;

    //Get all city tours
    public List<CityTourDto> getAllCityTours() {
        List<CityTour> cityTourList = cityTourRepository.findAll();
        List<CityTourDto> cityTourDtoList = new ArrayList<>();

        for (CityTour cityTour : cityTourList) {
            cityTourDtoList.add(new CityTourDto(cityTour));
        }

        return cityTourDtoList;
    }

}
