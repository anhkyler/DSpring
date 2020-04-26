package com.so.simpledemo;

public class CricketCoach implements Coach{
//setter injection
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("inside the cricket coach");
	}
	
	public void setFortuneService (FortuneService fortuneService) {
		System.out.println("inside the cricket fortune");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
		
	}
	
	
	//cai nay la load data from properties file
	
	private String propertyEmail;
	private String propertyTeam;

	public String getPropertyEmail() {
		return propertyEmail;
	}

	public void setPropertyEmail(String propertyEmail) {
		this.propertyEmail = propertyEmail;
	}

	public String getPropertyTeam() {
		return propertyTeam;
	}

	public void setPropertyTeam(String propertyTeam) {
		this.propertyTeam = propertyTeam;
	}
	
	

}
