package com.softserve.edu.controller;

import com.softserve.edu.dto.welcome.NewUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class WelcomeController {

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public void getUser(@RequestBody NewUserDTO newUserDTO){
        System.out.println(newUserDTO.toString());
    }
}
