package com.softserve.edu;

import com.softserve.edu.config.ServiceConfig;
import com.softserve.edu.entity.Job;
import com.softserve.edu.service.JobService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(ServiceConfig.class);
        applicationContext.getBean(JobService.class).save(new Job());
    }
}
