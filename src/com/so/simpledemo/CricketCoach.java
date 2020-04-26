package com.so.simpledemo;

public class CricketCoach implements Coach{
//setter injection
	private FortuneService fortuneService;
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
	

}
