package com.example.ass3.DAO;

import com.example.ass3.entity.Rate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public class RateDAOImp implements RateDAO {
    EntityManager entityManager;
    @Override
    public int getrate(String cover,String state) {
        TypedQuery<Rate> query = entityManager.createQuery("from rate where coverage =/'"+cover+"/' and state=/'"+state+"/'", Rate.class);
        return query.getResultList().getFirst().getRate();
    }
}
