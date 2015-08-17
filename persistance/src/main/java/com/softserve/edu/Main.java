package com.softserve.edu;

import com.softserve.edu.config.PersistanceConfig;
import com.softserve.edu.entity.Job;
import com.softserve.edu.entity.Person;
import com.softserve.edu.entity.Plant;
import com.softserve.edu.entity.util.JobType;
import com.softserve.edu.entity.util.UserStatus;
import com.softserve.edu.repository.CRUDRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main <T>{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        CRUDRepository<Person> crudRepository = new AnnotationConfigApplicationContext(PersistanceConfig.class)
                .getBean(CRUDRepository.class);
        crudRepository.setObjectClass(Person.class);
        Job job = new Main().save(crudRepository);
        new Main().save(crudRepository,job);
    }

    public Job save(CRUDRepository<Job> crudRepository){
        Job job = new Job();
        job.setName("Job");
        job.setJobType(JobType.PLANT);
        job.setQuantity(5);

        Person person = new Person();
        person.setName("Oles");
        person.setSurname("Onyshchak");
        person.setUserStatus(UserStatus.USER);

        Set<Person> set = new HashSet<Person>();
        set.add(person);
        job.setPersonSet(set);

        crudRepository.save(job);
        return job;
    }

    public void save(CRUDRepository<Plant> crudRepository,Job job){
        Plant plant = new Plant();
        plant.setJob(job);

        crudRepository.update(plant);
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
