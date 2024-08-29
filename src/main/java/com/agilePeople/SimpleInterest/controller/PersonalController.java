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
import com.agilePeople.SimpleInterest.repository.PersonalRepository;
import com.agilePeople.SimpleInterest.entity.Personal;

import com.agilePeople.SimpleInterest.service.PersonalService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
public class PersonalController {

    @Autowired
    private PersonalService personalService;


    @PostMapping(
            value = "/personal",
            produces = "application/json")
    public String postBody(@RequestBody Personal personal) {

        boolean res= personalService.savePersonal(personal);
        return String.valueOf(res);
    }

    @RequestMapping(path = "/personal", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public ResponseEntity<Boolean> createNewProject(Personal personal){
        Boolean project = personalService.savePersonal(personal);


        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    @GetMapping("/personal")
    public List<Personal> getAllPersonals() {
        return personalService.getPersonals();
    }



    @GetMapping("/fetchCustomer")
    public Personal getPersonalById(@RequestParam("id") Long id) {

        return personalService.getCustomerById(id);


    }


    @PutMapping("/personal")
    public Personal updatePersonal(@RequestParam("id") Long id, @RequestBody Personal personal) {

        return personalService.updatePersonal(id, personal);
    }
//   @PutMapping("/simpleInterest/{id}")
//   public SimpleInterest updateSimpleInterest(@PathVariable("id") Long id, @RequestBody SimpleInterest simpleInterest) {
//
//       return simpleCalculatorService.getIntrest(id);
//   }

    @DeleteMapping("/deleteCustomer")
    public String deletePersonal(@RequestParam("id") Long id) {

        return personalService.deletePersonal(id);
    }
}
