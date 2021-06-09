package com.koxx4;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today's your happy day! Come on!";
    }
}
