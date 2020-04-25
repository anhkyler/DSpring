package com.so.simpledemo;

public class BaseballCoach implements Coach {
	//DI-constructor
	private FortuneService fortuneService;//define field
	public BaseballCoach(FortuneService fortuneService) {//define constructor
		this.fortuneService = fortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "get 30 mins to workout";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
