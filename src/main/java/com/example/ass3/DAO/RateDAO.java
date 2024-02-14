package com.example.ass3.DAO;

import org.springframework.stereotype.Repository;

@Repository
public interface RateDAO {

    int getrate(String cover,String state);

}
