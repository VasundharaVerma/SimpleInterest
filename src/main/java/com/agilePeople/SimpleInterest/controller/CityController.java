package com.agilePeople.SimpleInterest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.agilePeople.SimpleInterest.entity.City;

import com.agilePeople.SimpleInterest.service.CityService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;





@CrossOrigin(origins = "*")
@RestController
public class CityController {

    @Autowired
    private CityService cityService;


    @GetMapping("/city")
    public List<City> getAllCitys() {
        return cityService.getCitys();
    }

//     @GetMapping("/address/{id}")
//     public Address getAddressById(@PathVariable("id") Long id) {
//
//    	 return addressService.getPin(id);
//
//
//     }


}