package com.agilePeople.SimpleInterest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.State;

import com.agilePeople.SimpleInterest.repository.StateRepository;



@Service
public class StateService {

    @Autowired
    StateRepository stateRepository;

    public List<State> getStates() {
        List<State> allStates = (List<State>) stateRepository.findAll();
        return allStates;
    }
}
