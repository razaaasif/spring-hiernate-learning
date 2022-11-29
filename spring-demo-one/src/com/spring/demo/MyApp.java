package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyFourtune());
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach2);
		context.close();	

	}

}
