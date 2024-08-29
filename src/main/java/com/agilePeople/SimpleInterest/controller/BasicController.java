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

import com.agilePeople.SimpleInterest.entity.Basic;

import com.agilePeople.SimpleInterest.service.BasicService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;


    @PostMapping(
            value = "/basic",
            produces = "application/json")
    public String postBody(@RequestBody Basic basic) {

        boolean res= basicService.saveBasic(basic);
        return String.valueOf(res);
    }

    @RequestMapping(path = "/basic", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public ResponseEntity<Boolean> createNewProject(Basic basic){
        Boolean project = basicService.saveBasic(basic);


        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }
//     @GetMapping("/simpleInterest")
//     public List<SimpleInterest> getAllSimpleInterests() {
//         List<SimpleInterest> allSimpleInterests = (List<SimpleInterest>) simpleInterestRepository.findAll();
//         return allSimpleInterests;
//     }

    @GetMapping("/basic/{id}")
    public Basic getBasicById(@PathVariable("id") Long id) {

        return basicService.getPhone(id);


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
