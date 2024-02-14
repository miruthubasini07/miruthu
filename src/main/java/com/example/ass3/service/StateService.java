package com.example.ass3.service;

import com.example.ass3.entity.State;

import java.util.List;

public interface StateService {
    List<State> grtallState();
    State getstateById(int id);
}
