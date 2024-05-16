package com.example.mycoolapp.rest;

import com.example.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;

    @Autowired
    DemoController(@Qualifier(value = "tennisCoach") Coach coach) {
        System.out.println("In DemoController constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}

