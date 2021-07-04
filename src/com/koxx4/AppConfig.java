package com.koxx4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
public class AppConfig {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public FortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean
    public Coach baseballCoach(){
        return new BaseballCoach(randomFortuneService());
    }

    @Bean
    public Coach bikeCoach(){
        return new BikeCoach(happyFortuneService());
    }

}
