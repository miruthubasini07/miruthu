package com.example.ass3.service;

import com.example.ass3.entity.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatue();
    Status getStatusByID(int id);
}
