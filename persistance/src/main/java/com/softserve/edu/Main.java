package com.softserve.edu;

import com.softserve.edu.config.PersistanceConfig;
import com.softserve.edu.entity.Person;
import com.softserve.edu.entity.util.UserStatus;
import com.softserve.edu.repository.CRUDRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(PersistanceConfig.class)
                .getBean(CRUDRepository.class)
                .save(new Person("1", "Oles", "Onyshchak", UserStatus.ADMIN));
    }
}
