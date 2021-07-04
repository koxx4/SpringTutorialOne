package com.koxx4;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		//load the  spring config file
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (BeansException e) {
			e.printStackTrace();
		}

		Coach theCoach = context.getBean("bikeCoach", Coach.class);
		Coach secondCoach = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(theCoach.getExerciseRoutine());
		System.out.println(secondCoach.getExerciseRoutine());
		System.out.println(theCoach.getTodaysFortune());
		System.out.println(secondCoach.getTodaysFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
