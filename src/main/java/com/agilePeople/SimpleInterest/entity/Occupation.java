package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Occupation {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String occupationTypeCode;


    private String occupationTypeName;


    public Occupation(Long id, String occupationTypeCode, String occupationTypeName) {
        super();
        this.id = id;
        this.occupationTypeCode = occupationTypeCode;
        this.occupationTypeName = occupationTypeName;
    }


    public Occupation() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getOccupationTypeCode() {
        return occupationTypeCode;
    }


    public void setOccupationTypeCode(String occupationTypeCode) {
        this.occupationTypeCode = occupationTypeCode;
    }


    public String getOccupationTypeName() {
        return occupationTypeName;
    }


    public void setOccupationTypeName(String occupationTypeName) {
        this.occupationTypeName = occupationTypeName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
