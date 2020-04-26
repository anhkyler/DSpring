package com.so.simpledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
