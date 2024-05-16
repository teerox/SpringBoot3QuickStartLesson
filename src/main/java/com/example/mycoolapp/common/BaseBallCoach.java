package com.example.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice. Spend 30 minutes on fielding practice. Spend 30 minutes on running practice.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
