package com.dariuslearning.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define private field for dependency
    private Coach myCoach;

    // Defind constructor for dependency injection
    @Autowired
    public DemoController(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
