package com.agilePeople.SimpleInterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String stateTypeCode;


    private String stateTypeName;


    public State(Long id, String stateTypeCode, String stateTypeName) {
        super();
        this.id = id;
        this.stateTypeCode = stateTypeCode;
        this.stateTypeName = stateTypeName;
    }


    public State() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getStateTypeCode() {
        return stateTypeCode;
    }


    public void setStateTypeCode(String stateTypeCode) {
        this.stateTypeCode = stateTypeCode;
    }


    public String getStateTypeName() {
        return stateTypeName;
    }


    public void setStateTypeName(String stateTypeName) {
        this.stateTypeName = stateTypeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
