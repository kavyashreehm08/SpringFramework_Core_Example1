package com.tryspringconstructorinj.springboot_concepts;

import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach{

@Override
    public String getDailyWorkOutDetails() {
        return "Practice Cricket fast bowling for 15 mins";
    }
}
