package org.example.citywalksbackend.controller;

import org.example.citywalksbackend.dto.CityTourDto;
import org.example.citywalksbackend.service.CityTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city-tours")
public class CityTourController {


    @Autowired
    private CityTourService cityTourService;

    //Get all equipment in database
    @CrossOrigin(origins = "*")
    @GetMapping("")
    public List<CityTourDto> getAllCityTours() {
        return cityTourService.getAllCityTours();
    }

}
