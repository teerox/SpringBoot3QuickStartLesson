package com.example.mycoolapp.common;

public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
