package com.agilePeople.SimpleInterest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.City;

import com.agilePeople.SimpleInterest.repository.CityRepository;



@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public List<City> getCitys() {
        List<City> allCitys = (List<City>) cityRepository.findAll();
        return allCitys;
    }
}
