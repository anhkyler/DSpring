package com.so.demoannotationspring;

import org.springframework.stereotype.Component;

@Component
public class ImplecitTennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "cai nay chi la daily workout";
	}

}
