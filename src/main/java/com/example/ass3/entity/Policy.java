package com.example.ass3.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String PolicyHolderName;
    private String address1;
    private String getAddress2;

    private int rate;

    @ManyToOne(cascade = CascadeType.ALL)
    State state;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Coverage> coverageList=new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyHolderName() {
        return PolicyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        PolicyHolderName = policyHolderName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getGetAddress2() {
        return getAddress2;
    }

    public void setGetAddress2(String getAddress2) {
        this.getAddress2 = getAddress2;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Coverage> getCoverageList() {
        return coverageList;
    }

    public void setCoverageList(List<Coverage> coverageList) {
        this.coverageList = coverageList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
