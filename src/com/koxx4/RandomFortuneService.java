package com.koxx4;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes;
    private Random randomGenerator;

    public RandomFortuneService() {
        this.fortunes = new String[3];
        this.randomGenerator = new Random();

        populateFortunes();
    }

    @Override
    public String getFortune() {
        return "Fortune for today: " + fortunes[randomGenerator.nextInt(fortunes.length)];
    }

    private void populateFortunes()
    {
        fortunes[0] = "Keep up the good work!";
        fortunes[1] = "Well today may not be your best day...";
        fortunes[2] = "You're great and not great at the same time :)";
    }

}
