package com.example.ass3.DAO;

import com.example.ass3.entity.State;

import java.util.List;

public interface StateDAO {
    List<State> grtallState();
    State getstateById(int id);
}
