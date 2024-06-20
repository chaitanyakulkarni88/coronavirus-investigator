package com.demo.coronavirusinvestigator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusInvestigatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronavirusInvestigatorApplication.class, args);
    }

}
