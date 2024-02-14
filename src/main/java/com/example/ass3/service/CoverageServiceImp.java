package com.example.ass3.service;

import com.example.ass3.DAO.CoverageDAOImp;
import com.example.ass3.entity.Coverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverageServiceImp implements CoverageService {
    @Autowired
    CoverageDAOImp coverageDAOImp;

    @Override
    public List<Coverage> getallCoverage() {
        return coverageDAOImp.getallCoverage();
    }

    @Override
    public Coverage findByid(int id) {
        return coverageDAOImp.GetCoveragesByid(id);
    }
}
