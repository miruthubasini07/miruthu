package com.example.ass3.DAO;

import com.example.ass3.entity.Coverage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository

public class CoverageDAOImp implements CoverageDAO {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Coverage> getallCoverage() {
        TypedQuery q=entityManager.createQuery("from Coverage ", Coverage.class);
        return q.getResultList();
    }

    @Override
    public Coverage  GetCoveragesByid(int id) {
        return entityManager.find(Coverage.class,id);
    }
}
