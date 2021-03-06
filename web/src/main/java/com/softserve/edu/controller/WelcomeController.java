package com.softserve.edu.controller;

import com.softserve.edu.dto.welcome.NewUserDTO;
import com.softserve.edu.entity.Person;
import com.softserve.edu.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
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
        welcomeService.save(
                new Person(
                        newUserDTO.getName(), newUserDTO.getSurname(), newUserDTO.getLogin(), newUserDTO.getPassword()
                )
        );
    }
}
