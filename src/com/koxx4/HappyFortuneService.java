package com.koxx4;

public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Today's your happy day! Come on!";
    }
}
