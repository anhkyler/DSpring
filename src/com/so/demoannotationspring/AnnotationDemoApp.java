package com.so.demoannotationspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section7-annotation-applicationContext.xml");
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		
		Coach implecitCoach = context.getBean("implecitTennisCoach",Coach.class);
		
		System.out.println(implecitCoach.getDailyWorkout());
		context.close();
				
	}

}
