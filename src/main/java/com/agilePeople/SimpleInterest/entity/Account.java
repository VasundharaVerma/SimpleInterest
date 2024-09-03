package com.agilePeople.SimpleInterest.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Account {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String accountTypeCode;


    private String accountTypeName;


    public Account(Long id, String accountTypeCode, String accountTypeName) {
        super();
        this.id = id;
        this.accountTypeCode = accountTypeCode;
        this.accountTypeName = accountTypeName;
    }


    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }


    public String getAccountTypeCode() {
        return accountTypeCode;
    }


    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }


    public String getAccountTypeName() {
        return accountTypeName;
    }


    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
