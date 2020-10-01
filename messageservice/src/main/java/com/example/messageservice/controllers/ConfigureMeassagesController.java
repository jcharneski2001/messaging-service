package com.example.messageservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigureMeassagesController {

    @RequestMapping({"/"})
    public String configure(){

        return "hello";
    }
}
