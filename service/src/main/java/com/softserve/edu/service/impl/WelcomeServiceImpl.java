package com.softserve.edu.service.impl;

import com.softserve.edu.entity.Job;
import com.softserve.edu.entity.Person;
import com.softserve.edu.repository.CRUDRepository;
import com.softserve.edu.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Autowired
    @Qualifier("CRUDRepositoryImpl")
    CRUDRepository<Person> crudRepository;

    public void save(Person person) {
        crudRepository.save(person);
    }
}
