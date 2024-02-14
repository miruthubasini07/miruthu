package com.example.ass3.service;

import com.example.ass3.DAO.RateDAO;
import com.example.ass3.DAO.RateDAOImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReteServiceImp implements RateService{
    @Autowired
    RateDAO rateDAO;
    @Override
    public int getrate(String cover, String state) {
        return rateDAO.getrate(cover,state);
    }
}
