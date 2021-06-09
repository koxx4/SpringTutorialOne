package com.koxx4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BikeCoach implements Coach
{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${coach.email}")
    private String email;
    @Value("${coach.name}")
    private String name;
    @Value("${coach.team}")
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public BikeCoach() {
        System.out.println(">> Inside empty constructor");
    }

    @Autowired
    public BikeCoach(@Qualifier("randomFortuneService")FortuneService fortuneService){
        this.fortuneService = fortuneService;
        System.out.println(">> Inside constructor with dependency");
    }

    @Override
    public String getExerciseRoutine()
    {
        return "Today make 10km in the forest son! Fast!";
    }

    @Override
    public String getTodaysFortune()
    {
        return this + fortuneService.getFortune();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTeam() {
        return team;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println(">> Inside setFortuneService()");
    }

    @Override
    public String toString() {
        return "BikeCoach: ";
    }
}
