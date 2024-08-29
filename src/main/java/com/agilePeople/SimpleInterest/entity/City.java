package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String cityTypeCode;


    private String cityTypeName;


    public City(Long id, String cityTypeCode, String cityTypeName) {
        super();
        this.id = id;
        this.cityTypeCode = cityTypeCode;
        this.cityTypeName = cityTypeName;
    }


    public City() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getCityTypeCode() {
        return cityTypeCode;
    }


    public void setCityTypeCode(String cityTypeCode) {
        this.cityTypeCode = cityTypeCode;
    }


    public String getCityTypeName() {
        return cityTypeName;
    }


    public void setCityTypeName(String cityTypeName) {
        this.cityTypeName = cityTypeName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
