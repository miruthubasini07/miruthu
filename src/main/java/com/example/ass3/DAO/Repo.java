package com.example.ass3.DAO;

import com.example.ass3.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Policy,Integer> {

}
