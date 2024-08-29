package com.agilePeople.SimpleInterest.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.agilePeople.SimpleInterest.entity.Personal;
import com.agilePeople.SimpleInterest.entity.SimpleInterest;
import com.agilePeople.SimpleInterest.repository.PersonalRepository;



@Service
public class PersonalService {

    @Autowired
    PersonalRepository personalRepository;

    public boolean savePersonal(Personal personal)
    {


        String fname = personal.getFname();
        String mname = personal.getMname();
        String lname = personal.getLname();
        String dob = personal.getDob();
        String gender = personal.getGender();
        String marital = personal.getMarital();
        String occu = personal.getOccu();

        personal.setFname(fname);
        personal.setMname(mname);
        personal.setLname(lname);
        personal.setDob(dob);
        personal.setGender(gender);
        personal.setMarital(marital);
        personal.setOccu(occu);
        Personal result = personalRepository.save(personal);

        if(null != result) {
            return true;
        }

        return false;
    }

    public Personal getCustomerById(long id)
    {
        Optional<Personal> personal = personalRepository.findById(id);
        if (personal.isPresent()) {
            return personal.get();
        }

        return null;

    }
    public List<Personal> getPersonals() {
        List<Personal> allPersonals = (List<Personal>) personalRepository.findAll();
        return allPersonals;
    }
    public String deletePersonal(long id) {
        personalRepository.deleteById(id);
        return "Customer deleted successfully";
    }

    public Personal updatePersonal(long id, Personal personal) {
        Optional<Personal> updatePersonal = personalRepository.findById(id);
        String fname = personal.getFname();
        String mname = personal.getMname();
        String lname = personal.getLname();
        String dob = personal.getDob();
        String gender = personal.getGender();
        String marital = personal.getMarital();
        String occu = personal.getOccu();

        personal.setId(id);
        personal.setFname(fname);
        personal.setMname(mname);
        personal.setLname(lname);
        personal.setDob(dob);
        personal.setGender(gender);
        personal.setMarital(marital);
        personal.setOccu(occu);

        return personalRepository.save(personal);
    }
}
