package com.example.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In CricketCoach constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 6 minutes. Practice batting for 10 minutes. Practice fielding for 5 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
