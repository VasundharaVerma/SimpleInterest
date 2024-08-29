package com.agilePeople.SimpleInterest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.SimpleInterest;
import com.agilePeople.SimpleInterest.repository.SimpleInterestRepository;


@Service
public class SimpleCalculatorService {

    @Autowired
    SimpleInterestRepository simpleInterestRepository;

    public boolean saveSimpleInterest(SimpleInterest simpleInterest)
    {
        // P * T * R /100

        Double principal = simpleInterest.getPrincipal();
        int roi = simpleInterest.getRoi();
        int time = simpleInterest.getTime();


        double inerest = (principal * roi * time) /100;

        double totalAmt = principal + inerest;

        simpleInterest.setInterest(inerest);

        simpleInterest.setTotalAmount(totalAmt);


        SimpleInterest result = simpleInterestRepository.save(simpleInterest);

        if(null != result) {
            return true;
        }

        return false;
    }

    public SimpleInterest getIntrest(long id)
    {
        Optional<SimpleInterest> simpleInterest = simpleInterestRepository.findById(id);
        if (simpleInterest.isPresent()) {
            return simpleInterest.get();
        }

        return null;

    }
    public List<SimpleInterest> getInterest() {
        List<SimpleInterest> allSimpleInterests = (List<SimpleInterest>) simpleInterestRepository.findAll();
        return allSimpleInterests;
    }
}
