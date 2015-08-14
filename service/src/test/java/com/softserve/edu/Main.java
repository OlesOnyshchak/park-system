package com.softserve.edu;

import com.softserve.edu.config.PersistanceConfig;
import com.softserve.edu.entity.Job;
import com.softserve.edu.repository.CRUDRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        CRUDRepository<Job> crudRepository = new AnnotationConfigApplicationContext(PersistanceConfig.class).getBean(CRUDRepository.class);
        crudRepository.setObjectClass(Job.class);
        crudRepository.save(new Job());
    }
}
