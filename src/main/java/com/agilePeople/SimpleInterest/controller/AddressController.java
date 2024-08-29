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

import com.agilePeople.SimpleInterest.entity.Address;

import com.agilePeople.SimpleInterest.service.AddressService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;





@CrossOrigin(origins = "*")
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;



    @PostMapping(
            value = "/address",
            produces = "application/json")
    public String postBody(@RequestBody Address address) {

        boolean res= addressService.saveAddress(address);
        return String.valueOf(res);
    }

    @RequestMapping(path = "/address", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public ResponseEntity<Boolean> createNewProject(Address address){
        Boolean project = addressService.saveAddress(address);


        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }
//     @GetMapping("/simpleInterest")
//     public List<SimpleInterest> getAllSimpleInterests() {
//         List<SimpleInterest> allSimpleInterests = (List<SimpleInterest>) simpleInterestRepository.findAll();
//         return allSimpleInterests;
//     }

    @GetMapping("/address/{id}")
    public Address getAddressById(@PathVariable("id") Long id) {

        return addressService.getPin(id);


    }


//     @PutMapping("/simpleInterest/{id}")
//     public SimpleInterest updateSimpleInterest(@PathVariable("id") Long id, @RequestBody SimpleInterest simpleInterest) {
//
//         return simpleCalculatorService.getIntrest(id);
//     }
//
//
//     @DeleteMapping("/simpleInterest/{id}")
//     public String deleteSimpleInterest(@PathVariable("id") Long id) {
//    	 simpleInterestRepository.deleteById(id);
//         return "SimpleInterest deleted successfully";
//     }
}
