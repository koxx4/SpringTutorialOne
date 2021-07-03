package com.koxx4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
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

	public BaseballCoach(){

	}

	@Override
	public String getTodaysFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getExerciseRoutine() {
		return "Throw some balls 50 times son";
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

}
