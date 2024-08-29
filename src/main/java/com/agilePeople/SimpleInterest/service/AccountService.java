package com.agilePeople.SimpleInterest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilePeople.SimpleInterest.entity.Account;

import com.agilePeople.SimpleInterest.repository.AccountRepository;



@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccounts() {
        List<Account> allAccounts = (List<Account>) accountRepository.findAll();
        return allAccounts;
    }
}
