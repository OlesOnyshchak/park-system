package com.softserve.edu;

import com.softserve.edu.config.PersistanceConfig;
import com.softserve.edu.entity.Person;
import com.softserve.edu.entity.util.UserStatus;
import com.softserve.edu.repository.CRUDRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Main <T>{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        CRUDRepository<Person> crudRepository = new AnnotationConfigApplicationContext(PersistanceConfig.class)
                .getBean(CRUDRepository.class);
        crudRepository.setObjectClass(Person.class);
        new Main().save(crudRepository);
    }

    public void save(CRUDRepository<Person> crudRepository){
        crudRepository.save(new Person("Oles", "Onyshchak", UserStatus.USER));
    }

    public void getAll(CRUDRepository<Person> crudRepository){
        crudRepository.setObjectClass(Person.class);
        List<Person> list = crudRepository.findALL();
        System.out.println(list.get(0).getName());
    }

    public void update(CRUDRepository<Person> crudRepository){
        crudRepository.update(new Person("Someone", "Onyshchak", UserStatus.USER));
    }

    public void findById(CRUDRepository<Person> crudRepository){
        crudRepository.setObjectClass(Person.class);
        Person person = crudRepository.findById("1");
        System.out.println(person.getName());
    }
}
