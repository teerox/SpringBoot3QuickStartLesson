package com.example.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley. Practice your serve. Practice your forehand volley.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
