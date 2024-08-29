package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SimpleInterest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private Double principal;


    private int roi;


    private int time;


    private Double interest;


    private Double totalAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public SimpleInterest(Long id, Double principal, int roi, int time, Double interest, Double totalAmount) {
        super();
        this.id = id;
        this.principal = principal;
        this.roi = roi;
        this.time = time;
        this.interest = interest;
        this.totalAmount = totalAmount;
    }

    public SimpleInterest() {
        super();
    }





}
