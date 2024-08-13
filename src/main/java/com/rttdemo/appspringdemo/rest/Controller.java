package com.rttdemo.appspringdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${dragon.name}")
    private String dragon;

    @GetMapping("/")
    private String hello () {
        return "Hello World !";
    }

    @GetMapping ("/dragons")
    private String dragon () {
        return this.dragon;
    }

    @GetMapping ("/eat")
    private void eat () {
        System.out.println("I am hungry, it is almost lunch time! ");
    }
}
