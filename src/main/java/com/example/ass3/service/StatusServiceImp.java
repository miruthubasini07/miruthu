package com.example.ass3.service;

import com.example.ass3.DAO.StateDAOImp;
import com.example.ass3.DAO.StatusDAOImp;
import com.example.ass3.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImp implements StatusService{
    @Autowired
    StatusDAOImp statusDAOImp;
    @Override
    public List<Status> getAllStatue() {
        return statusDAOImp.getAllStatue();
    }

    @Override
    public Status getStatusByID(int id) {
        return statusDAOImp.getStatusByID(id);
    }
}
