package com.example.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
