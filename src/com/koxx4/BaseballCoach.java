package com.koxx4;

public class BaseballCoach implements Coach {

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

	@Override
	public String getTodaysFortune()
	{
		return null;
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
