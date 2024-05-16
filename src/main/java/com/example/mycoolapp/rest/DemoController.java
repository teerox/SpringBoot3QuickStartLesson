package com.example.mycoolapp.rest;

import com.example.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;
    private final Coach anotherCoach;

    //private final Coach swimCoach;

    @Autowired
    DemoController(@Qualifier(value = "cricketCoach") Coach coach,
                   @Qualifier(value = "tennisCoach") Coach baseballCoach){
        // System.out.println("In DemoController constructor: " + getClass().getSimpleName());
        this.myCoach = coach;
        this.anotherCoach = baseballCoach;
       // this.swimCoach = swimCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing bean: myCoach == anotherCoach: " + (myCoach == anotherCoach);
    }
}

