package com.example.ass3.service;

import com.example.ass3.DAO.PolicyDAOImp;
import com.example.ass3.DAO.Repo;
import com.example.ass3.entity.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImp implements Policyservice{
    @Autowired
    Repo r;
    @Autowired
    PolicyDAOImp policyDAOImp;
    @Override
    public List<Policy> getallPolicy() {
        return policyDAOImp.getallPolicy();
    }

    @Override
    public Policy getPolicyById(int id) {
        return policyDAOImp.getPolicyById(id);
    }

    @Override
    public Policy savePolicy(Policy policy) {
        return policyDAOImp.savePolicy(policy);
    }

    @Override
    public List<Policy> view() {
        return r.findAll();
    }

}
