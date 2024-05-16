package com.example.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 6 minutes. Practice batting for 10 minutes. Practice fielding for 5 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
