package com.so.demoannotationspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionTennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public SetterInjectionTennisCoach() {
		System.out.println("my Tennis code default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	//cai nay la setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("inside setter injection");
//	}
	
	@Autowired
	public void doSomeCrazyStuff() {
		System.out.println("I am doing crazy stuffs!!");
	}
	
}
