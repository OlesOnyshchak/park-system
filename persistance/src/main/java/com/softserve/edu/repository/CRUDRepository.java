package com.softserve.edu.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRUDRepository <T>{

    void setObjectClass(Class<T> objectClass);

    void save (T object);

    T findById(String id);

    List<T> findALL();

    void delete(T object);

    void update(T object);
}
