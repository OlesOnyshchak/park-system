package com.softserve.edu.service;

import com.softserve.edu.entity.Person;
import org.springframework.stereotype.Service;

@Service
public interface WelcomeService {
    void save(Person person);
}
