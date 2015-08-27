package com.softserve.edu.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParkController {

    @RequestMapping(value = {"/welcome"})
    public String showWelcomePage() {
        return "app/index.html";
    }

}
