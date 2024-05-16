package com.example.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
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
