package com.agilePeople.SimpleInterest.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.Basic;

import com.agilePeople.SimpleInterest.repository.BasicRepository;



@Service
public class BasicService {

    @Autowired
    BasicRepository basicRepository;

    public boolean saveBasic(Basic basic)
    {


        String phone = basic.getPhone();
        String email = basic.getEmail();
        String account = basic.getAccount();



        basic.setPhone(phone);

        basic.setEmail(email);
        basic.setAccount(account);

        Basic result = basicRepository.save(basic);

        if(null != result) {
            return true;
        }

        return false;
    }

    public Basic getPhone(long id)
    {
        Optional<Basic> basic = basicRepository.findById(id);
        if (basic.isPresent()) {
            return basic.get();
        }

        return null;

    }
}
