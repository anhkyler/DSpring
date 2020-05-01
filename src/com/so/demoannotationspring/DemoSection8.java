package com.so.demoannotationspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSection8 {
	public static void main(String[]arggs) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section8-applicationContext.xml");
		Coach theCoach =  context.getBean("tennisCoach",Coach.class);	
		
		Coach thCoachSetter = context.getBean("setterInjectionTennisCoach",Coach.class);
		
	}
	
}
