package com.so.simpledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoForSetterInjection {

	public static void main(String[] args) {
		//load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call method on the bean
		
		//close the context
		context.close();
	}

}
