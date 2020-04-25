package com.so.simpledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class); //mycoach is id, coach.class is calling Coach
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
