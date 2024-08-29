package com.agilePeople.SimpleInterest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.Kyc;

import com.agilePeople.SimpleInterest.repository.KycRepository;



@Service
public class KycService {

    @Autowired
    KycRepository kycRepository;

    public boolean saveKyc(Kyc kyc)
    {


        String aadhar = kyc.getAadhar();
        String pan = kyc.getPan();
        String stdid = kyc.getStdid();

        kyc.setAadhar(aadhar);
        kyc.setPan(pan);
        kyc.setStdid(stdid);
        Kyc result = kycRepository.save(kyc);

        if(null != result) {
            return true;
        }

        return false;
    }

    public Kyc getAadhar(long id)
    {
        Optional<Kyc> kyc = kycRepository.findById(id);
        if (kyc.isPresent()) {
            return kyc.get();
        }

        return null;

    }
}
