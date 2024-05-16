package com.example.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
       // System.out.println("In CricketCoach constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 6 minutes. Practice batting for 10 minutes. Practice fielding for 5 minutes.";
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("CricketCoach: inside method doMyStartupStuff");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanUp() {
        System.out.println("CricketCoach: cleaning up");
    }
    @Override
    public String getDailyFortune() {
        return null;
    }
}
