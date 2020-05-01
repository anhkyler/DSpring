package com.so.demoannotationspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//field injection se lam nhiem vu reflection behind the scene
	@Autowired
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		//System.out.println("my Tennis code default constructor");
		System.out.println("khi su dung field injection se co cai nay");
	}
	//autowire la no se lay method nay ra ma khong can phai khai bao trong xml
	//@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
