package com.so.simpledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same bean
		boolean result  = (theCoach == alphaCoach);
		System.out.println("same object" + result);
		//neu dung singleton thi hai cai nay la nhu nhau - neu la prototype thi hai cai se khac nhau
		System.out.println("memory location 1: " + theCoach);
		System.out.println("memory location 2: " + alphaCoach);
	}

}
