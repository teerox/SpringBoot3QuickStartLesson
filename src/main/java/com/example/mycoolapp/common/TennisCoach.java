package com.example.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In TennisCoach constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {

        return "Practice your backhand volley. Practice your serve. Practice your forehand volley.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
