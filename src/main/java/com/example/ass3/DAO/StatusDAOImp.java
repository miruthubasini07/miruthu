package com.example.ass3.DAO;

import com.example.ass3.entity.Status;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class StatusDAOImp implements StatusDAO {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Status> getAllStatue() {
        TypedQuery q=entityManager.createQuery("from Status ", Status.class);
        return q.getResultList();
    }

    @Override
    public Status getStatusByID(int id) {
        return entityManager.find(Status.class,id);
    }
}
