package com.agilePeople.SimpleInterest.controller;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.agilePeople.SimpleInterest.entity.Basic;
import com.agilePeople.SimpleInterest.entity.FirstLogin;
import com.agilePeople.SimpleInterest.entity.Personal;
import com.agilePeople.SimpleInterest.entity.SimpleInterest;
import com.agilePeople.SimpleInterest.repository.FirstLoginRepository;
import com.agilePeople.SimpleInterest.service.FirstLoginService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController

public class FirstLoginController {

    @Autowired
    private FirstLoginService loginService;

    @Autowired
    private FirstLoginRepository loginRepository;

//	 @RequestMapping(value = "/checkEmail/{phone}",method = RequestMethod.GET)
//	  public boolean getPhone(@PathVariable("phone") String phone) {
//	  return loginService.getPhone(phone);
//
//	 }
//
//	 @RequestMapping(value = "/checkEmail/{email}",method = RequestMethod.GET)
//	 public boolean getEmail(@PathVariable("email") String email) {
//		return loginService.getEmail(email);
//
//
//	 }

    //	 @RequestMapping(value = "/checkEmail/{pin}",method = RequestMethod.GET)
//	 public boolean getPin(@PathVariable("pin") String pin) {
//
//		return loginService.getPin(pin)
//
//	 }
    @GetMapping("/checkEmail")
    public List<FirstLogin> getAllLogins() {
        return loginService.getLogins();
    }


    @PostMapping(
            value = "/doLogin",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody boolean doLogin(@RequestBody FirstLogin login) {

        System.out.println(login.getEmail()+login.getPin()+login.getActive());

        Optional<FirstLogin> loginResponse = null;
        if(login.getEmail() != null)
        {
            loginResponse = loginRepository.findLoginByEmailAndMpinAndActive(login.getEmail(), login.getPin(), login.getActive());
        }
        else if(login.getPhone() != null)
        {
            loginResponse = loginRepository.findLoginByMobileAndMpinAndActive(login.getPhone(), login.getPin(), login.getActive());

        }

        if (loginResponse.isPresent()) {
            System.out.println( loginResponse.get());
        }
        return loginResponse.isPresent();
    }


}



