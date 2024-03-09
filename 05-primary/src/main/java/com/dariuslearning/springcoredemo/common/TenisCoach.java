package com.dariuslearning.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your back hand volley.";
    }
}
