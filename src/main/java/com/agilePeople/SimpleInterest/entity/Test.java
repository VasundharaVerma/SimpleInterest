package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Test {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String mobile;


    private String amount;

    private String accno;


    public Test(Long id, String mobile, String account, String accno) {
        super();
        this.id = id;
        this.mobile = mobile;
        this.amount = account;
        this.accno = accno;
    }


    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getAccno() {
        return accno;
    }


    public void setAccno(String accno) {
        this.accno = accno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
