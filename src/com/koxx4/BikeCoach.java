package com.koxx4;

public class BikeCoach implements Coach
{
    private FortuneService fortuneService;
    private String email;
    private String name;
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

    public BikeCoach()
    {

    }

    public BikeCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
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

    public void setFortuneService(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String toString()
    {
        return "BikeCoach: ";
    }
}
