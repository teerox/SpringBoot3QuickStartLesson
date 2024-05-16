package com.example.mycoolapp.config;

import com.example.mycoolapp.common.Coach;
import com.example.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //@Bean(name = "aquaticsCoach") - custom bean name
    @Bean()
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
