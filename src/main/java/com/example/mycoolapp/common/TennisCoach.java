package com.example.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
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
