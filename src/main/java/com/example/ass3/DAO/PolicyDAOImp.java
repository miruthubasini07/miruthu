package com.example.ass3.DAO;

import com.example.ass3.entity.Policy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class PolicyDAOImp implements PolicyDAO {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Policy> getallPolicy() {
        TypedQuery q=entityManager.createQuery("from Policy ",Policy.class);
        return q.getResultList();
    }

    @Override
    public Policy getPolicyById(int id) {
        return entityManager.find(Policy.class,id);
    }

    @Transactional
    @Override
    public Policy savePolicy(Policy policy) {
        return entityManager.merge(policy);
    }
}
