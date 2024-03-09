package com.dariuslearning.springcoredemo.config;

import com.dariuslearning.springcoredemo.common.Coach;
import com.dariuslearning.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
