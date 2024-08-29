package com.agilePeople.SimpleInterest.controller;

import java.net.URI;
import java.util.List;

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

import com.agilePeople.SimpleInterest.entity.SimpleInterest;
import com.agilePeople.SimpleInterest.service.SimpleCalculatorService;
import com.agilePeople.SimpleInterest.repository.SimpleInterestRepository;

@CrossOrigin(origins = "*")
@RestController
public class SimpleInterestController {

    @Autowired
    private SimpleCalculatorService simpleCalculatorService;
    private SimpleInterestRepository simpleInterestRepository;
    @PostMapping(
            value = "/simpleInterest",
            produces = "application/json")
    public String postBody(@RequestBody SimpleInterest simpleInterest) {

        boolean res= simpleCalculatorService.saveSimpleInterest(simpleInterest);
        return String.valueOf(res);
    }
    //	 @PostMapping(value = "/simpleInterest", consumes = {"application/json"})
//     public boolean saveSimpleInterest(@RequestBody SimpleInterest simpleInterest) {
//
//          return simpleCalculatorService.saveSimpleInterest(simpleInterest);
//     }
//
    @RequestMapping(path = "/simpleInterest", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public ResponseEntity<Boolean> createNewProject(SimpleInterest simpleInterest){
        Boolean project = simpleCalculatorService.saveSimpleInterest(simpleInterest);


        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    @GetMapping("/simpleInterest")
    public List<SimpleInterest> getAllSimpleInterests() {
        return simpleCalculatorService.getInterest();
    }

    @GetMapping("/simpleInterest/{id}")
    public SimpleInterest getSimpleInterestById(@PathVariable("id") Long id) {

        return simpleCalculatorService.getIntrest(id);

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
