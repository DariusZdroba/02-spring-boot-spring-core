package com.dariuslearning.springcoredemo.rest;

import com.dariuslearning.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public DemoController(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    // Define private field for dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach")Coach theCoach){

        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
