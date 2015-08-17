package com.softserve.edu.service.impl;

import com.softserve.edu.service.JobService;
import com.softserve.edu.entity.Job;
import com.softserve.edu.repository.CRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{


    @Autowired
    @Qualifier("CRUDRepositoryImpl")
    CRUDRepository<Job> crudRepository;

    public void save(Job job) {
        crudRepository.save(job);
    }
}
