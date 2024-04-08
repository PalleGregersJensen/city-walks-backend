package org.example.citywalksbackend.service;

import org.example.citywalksbackend.dto.CityTourDto;
import org.example.citywalksbackend.dto.TourDateDto;
import org.example.citywalksbackend.entity.CityTour;
import org.example.citywalksbackend.entity.TourDate;
import org.example.citywalksbackend.repository.CityTourRepository;
import org.example.citywalksbackend.repository.TourDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourDateService {
    @Autowired
    TourDateRepository tourDateRepository;

    //Get all tour dates
    public List<TourDateDto> getAllTourDates() {
        List<TourDate> tourDateList = tourDateRepository.findAll();
        List<TourDateDto> tourDateDtoList = new ArrayList<>();

        for (TourDate tourDate : tourDateList) {
            tourDateDtoList.add(new TourDateDto(tourDate));
        }

        return tourDateDtoList;
    }

}
