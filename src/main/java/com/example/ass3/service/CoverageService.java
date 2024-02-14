package com.example.ass3.service;

import com.example.ass3.entity.Coverage;

import java.util.List;

public interface CoverageService {

    List<Coverage> getallCoverage();

    Coverage findByid(int id);
}
