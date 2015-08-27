package com.softserve.edu.controller;

import com.softserve.edu.dto.admin.NewJobDTO;
import com.softserve.edu.dto.welcome.NewUserDTO;
import com.softserve.edu.entity.Job;
import com.softserve.edu.entity.Person;
import com.softserve.edu.entity.Plant;
import com.softserve.edu.service.JobService;
import com.softserve.edu.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/")
public class AdminController {

    @Autowired
    JobService jobService;

    @RequestMapping(value = "save-job", method = RequestMethod.POST)
    public void getNewUser(@RequestBody NewJobDTO newJobDTO) {
        jobService.save(new Job(newJobDTO.getName(),newJobDTO.getDescription(),new HashSet<Person>(),newJobDTO.getPersonQuantity(),new HashSet<Plant>()));
    }
}
