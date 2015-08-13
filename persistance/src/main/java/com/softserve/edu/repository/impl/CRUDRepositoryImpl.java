package com.softserve.edu.repository.impl;

import com.softserve.edu.repository.CRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class CRUDRepositoryImpl<T> implements CRUDRepository<T>{

    @Autowired
    protected EntityManager entityManager;

    @Override
    @Transactional
    public void save(T object) {
        entityManager.merge(object);
    }
}
