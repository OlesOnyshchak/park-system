package com.softserve.edu.service;

import com.softserve.edu.entity.Job;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    void save(Job job);
}
