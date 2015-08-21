package com.softserve.edu.controller;

import com.softserve.edu.dto.welcome.NewUserDTO;
import com.softserve.edu.entity.Job;
import com.softserve.edu.entity.Person;
import com.softserve.edu.repository.CRUDRepository;
import com.softserve.edu.service.JobService;
import com.softserve.edu.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public void getNewUser(@RequestBody NewUserDTO newUserDTO) {
        System.out.println(newUserDTO.toString());
        welcomeService.save(
                new Person(
                        newUserDTO.getName(), newUserDTO.getSurname(), newUserDTO.getLogin(), newUserDTO.getPassword()
                )
        );
    }
}
