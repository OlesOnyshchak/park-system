package com.softserve.edu.service.impl;

import com.softserve.edu.entity.Job;
import com.softserve.edu.repository.impl.CRUDRepositoryImpl;
import com.softserve.edu.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    CRUDRepositoryImpl crudRepository;
    @Override
    public void save(Job job) {
    crudRepository.save(job);
    }
}
