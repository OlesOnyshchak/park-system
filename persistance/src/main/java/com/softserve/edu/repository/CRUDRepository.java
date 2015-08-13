package com.softserve.edu.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepository <T>{
    void save (T object);
}
