package com.example.ass3.DAO;

import com.example.ass3.entity.Policy;

import java.util.List;


public interface PolicyDAO {

    List<Policy> getallPolicy();

    Policy getPolicyById(int id);

    Policy savePolicy(Policy policy);
}
