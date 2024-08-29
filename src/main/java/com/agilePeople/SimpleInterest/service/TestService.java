package com.agilePeople.SimpleInterest.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.agilePeople.SimpleInterest.entity.Test;

import com.agilePeople.SimpleInterest.repository.TestRepository;



@Service
public class TestService {

    @Autowired
    TestRepository testRepository;
//
//	public boolean savePersonal(Personal personal)
//	{
//
//
//	   	 String fname = personal.getFname();
//	   	String mname = personal.getMname();
//	   	String lname = personal.getLname();
//	   	 String dob = personal.getDob();
//	   	 String gender = personal.getGender();
//	   	String marital = personal.getMarital();
//	   	String occu = personal.getOccu();
//
//	   	personal.setFname(fname);
//	   	personal.setMname(mname);
//	   	personal.setLname(lname);
//	   	personal.setDob(dob);
//	   	personal.setGender(gender);
//	   	personal.setMarital(marital);
//	   	personal.setOccu(occu);
//	   	Personal result = personalRepository.save(personal);
//
//	   	if(null != result) {
//	        return true;
//		}
//
//		return false;
//		}

    public Test getCustomerById(long id)
    {
        Optional<Test> test = testRepository.findById(id);
        if (test.isPresent()) {
            return test.get();
        }

        return null;

    }
    public List<Test> getTests() {
        List<Test> allTests = (List<Test>) testRepository.findAll();
        return allTests;
    }
//		public String deletePersonal(long id) {
//	    	 personalRepository.deleteById(id);
//	         return "Customer deleted successfully";
//	     }

    public Test updateTest(long id, Test test) {
        Optional<Test> updateTest = testRepository.findById(id);

        String mobile = test.getMobile();
        String amount = test.getAmount();
        String accno = test.getAccno();
        test.setId(id);
        test.setAccno(accno);
        test.setAmount(amount);
        test.setMobile(mobile);


        return testRepository.save(test);
    }
}
