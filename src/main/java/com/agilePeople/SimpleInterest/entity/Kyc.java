package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kyc {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String aadhar;

    private String pan;
    private String stdid;

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getStdid() {
        return stdid;
    }

    public void setStdid(String stdid) {
        this.stdid = stdid;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Kyc(Long id, String aadhar, String pan, String stdid) {
        super();
        this.id = id;
        this.aadhar = aadhar;
        this.pan = pan;
        this.stdid = stdid;
    }


    public Kyc() {
        super();
        // TODO Auto-generated constructor stub
    }

}
