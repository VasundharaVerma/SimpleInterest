package com.agilePeople.SimpleInterest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.Occupation;

import com.agilePeople.SimpleInterest.repository.OccupationRepository;



@Service
public class OccupationService {

    @Autowired
    OccupationRepository occupationRepository;

    public List<Occupation> getOccupations() {
        List<Occupation> allOccupations = (List<Occupation>) occupationRepository.findAll();
        return allOccupations;
    }
}
