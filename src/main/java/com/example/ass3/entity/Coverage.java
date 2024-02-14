package com.example.ass3.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String CoverageName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverageName() {
        return CoverageName;
    }

    public void setCoverageName(String coverageName) {
        CoverageName = coverageName;
    }



}
