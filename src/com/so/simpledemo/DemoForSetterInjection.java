package com.so.simpledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoForSetterInjection {

	public static void main(String[] args) {
		//load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call method on the bean
		
		//lay gia tri tu trong injection value
		System.out.println(theCoach.getEmailAddress());
		
		
		//lay gia tri tu trong property file.
		System.out.println(theCoach.getPropertyEmail());
		System.out.println(theCoach.getPropertyTeam());
		//close the context
		context.close();
	}

}
