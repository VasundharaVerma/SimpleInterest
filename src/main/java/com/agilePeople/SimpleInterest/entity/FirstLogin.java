package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FirstLogin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String userId;
    private String email;
    private String phone;

    private String pin;
    private String active="Y";

    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public FirstLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FirstLogin(Long id, String userId, String email, String phone, String pin, String active) {
        super();
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.pin = pin;
        this.active = active;
    }



}