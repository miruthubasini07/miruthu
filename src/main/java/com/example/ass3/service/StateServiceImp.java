package com.example.ass3.service;

import com.example.ass3.DAO.StateDAOImp;
import com.example.ass3.entity.State;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImp implements StateService{
    @Autowired
    StateDAOImp stateDAOImp;
    @Override
    public List<State> grtallState() {
        return stateDAOImp.grtallState();
    }

    @Override
    public State getstateById(int id) {
        return stateDAOImp.getstateById(id);
    }
}
