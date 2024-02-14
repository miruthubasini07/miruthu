package com.example.ass3.DAO;

import com.example.ass3.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class StateDAOImp implements StateDAO {
    @Autowired
    EntityManager entityManager;


    @Override
    public List<State> grtallState() {
        TypedQuery q=entityManager.createQuery("from State ", State.class);
        return q.getResultList();
    }

    @Override
    public State getstateById(int id) {
        return entityManager.find(State.class,id);
    }
}
