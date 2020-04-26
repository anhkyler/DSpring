package com.so.simpledemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "this comes from trackcoach";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just the fortune service"+fortuneService.getFortune();
	}
	
	public void doingMyStartupStuff() {
		System.out.println("TrackCoach:inside method stuff: startup");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach:inside method stuff: destroy stuff");
	}

}
