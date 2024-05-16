package com.example.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages = {"com.example.mycoolapp", "com.example.mycoolapp.common", "com.example.mycoolapp.rest"}
//)
@SpringBootApplication
public class MyCoolAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCoolAppApplication.class, args);
    }

}
