

package com.agilePeople.SimpleInterest.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.FirstLogin;
import com.agilePeople.SimpleInterest.entity.Personal;
import com.agilePeople.SimpleInterest.entity.SimpleInterest;
import com.agilePeople.SimpleInterest.repository.FirstLoginRepository;



@Service
public class FirstLoginService {

    @Autowired
    FirstLoginRepository loginRepository;

    public boolean saveLogin(FirstLogin login)
    {

        String userId = login.getUserId();
        String email = login.getEmail();
        String phone = login.getPhone();
        String pin = login.getPin();


        Optional<FirstLogin> login1 = loginRepository.findByEmail(email);
//	   	Optional<Login> login2 = loginRepository.findByPin(login1.getPin());

        if (login1.isPresent()) {

            return true;
        }

        return false;

    }
    public boolean savePin(FirstLogin login)
    {
        saveLogin(login);

        String userId = login.getUserId();
        String email = login.getEmail();
        String phone = login.getPhone();
        String pin = login.getPin();



        Optional<FirstLogin> login2 = loginRepository.findByPin(pin);
        if (login2.isPresent()) {

            return true;
        }

        return false;

    }
//	   	login.setUserId(userId);
//	   	login.setEmail(email);
//	   	login.setPhone(phone);
//	   	login.setPin(pin);
//
//	   	Login result = loginRepository.save(login);
//
//	   	if(null != result) {
//	        return true;
//		}
//
//		return false;
//		}

//		public boolean getEmail(String email)
//		{
//			 Optional<Login> login = loginRepository.findByEmail(email);
//
//	         if (login.isPresent()) {
//
//	             return true;
//	         }
//
//	         return false;
//
//		}
//

    public List<FirstLogin> getLogins() {
        List<FirstLogin> allLogins = (List<FirstLogin>) loginRepository.findAll();
        return allLogins;
    }

//		public boolean getPhone(String phone) {
//
//			Optional<Login> login = loginRepository.findByPhone(phone);
//	         if (login.isPresent()) {
//	             return true;
//	         }
//	         return false;
//		}
//

}

