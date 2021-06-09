package com.koxx4;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args)
	{
		//load the  spring config file
		ClassPathXmlApplicationContext context = null;
		try
		{
			context = new
					ClassPathXmlApplicationContext("applicationContext.xml");
		} catch (BeansException e)
		{
			e.printStackTrace();
		}

		Coach theCoach = context.getBean("bikeCoach", Coach.class);
		
		System.out.println(theCoach.getExerciseRoutine());
		System.out.println(theCoach.getTodaysFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		context.close();
	}

}
