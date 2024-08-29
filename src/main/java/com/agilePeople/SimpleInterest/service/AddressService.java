package com.agilePeople.SimpleInterest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.Address;

import com.agilePeople.SimpleInterest.repository.AddressRepository;



@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public boolean saveAddress(Address address)
    {

        Address result = addressRepository.save(address);

        if(null != result) {
            return true;
        }

        return false;
    }

    public Address getPin(long id)
    {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            return address.get();
        }

        return null;

    }
}

