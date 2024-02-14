package com.example.ass3.service;

import com.example.ass3.entity.Policy;

import java.util.List;

public interface Policyservice {
    List<Policy> getallPolicy();

    Policy getPolicyById(int id);

    Policy savePolicy(Policy policy);
    List<Policy> view();
}
