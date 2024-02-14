package com.example.ass3.DAO;

import com.example.ass3.entity.Coverage;

import java.util.List;

public interface CoverageDAO {
    List<Coverage> getallCoverage();

    Coverage GetCoveragesByid(int id);
}
