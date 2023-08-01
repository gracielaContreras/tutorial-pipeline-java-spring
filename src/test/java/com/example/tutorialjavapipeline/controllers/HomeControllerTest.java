package com.example.tutorialjavapipeline.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HomeControllerTest {

    @Autowired
    HomeController homeController;

    @Test
    public void homeController_healthCheck_returnsOk() {
        assertEquals(homeController.healthCheck(), "ok");
    }

    @Test
    public void homeController_getPeople_returnsListOf20People() {
        assertEquals(homeController.getPeople().size(), 20);
    }

}