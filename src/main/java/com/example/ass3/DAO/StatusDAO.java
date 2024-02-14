package com.example.ass3.DAO;

import com.example.ass3.entity.Status;

import java.util.List;

public interface StatusDAO {
    List<Status> getAllStatue();
    Status getStatusByID(int id);
}
