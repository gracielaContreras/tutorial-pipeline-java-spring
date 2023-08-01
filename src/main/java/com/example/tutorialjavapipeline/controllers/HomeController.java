package com.example.tutorialjavapipeline.controllers;

import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomPerson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String healthCheck(){
        return "ok";
    }

    @GetMapping("/people")
    public List<Person> getPeople(){
        return RandomPerson.get().listOf(20);
    }


}
