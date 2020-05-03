package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create the object
		/*
		 * Coach theCoach = new BaseballCoach(null); // use the object
		 * System.out.print(theCoach.getDailyWorkOut());
		 */

		// Step1 Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Step2 retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// let's call our new method for fortune
		System.out.print(theCoach.getDailFortune());

		// close the context
		context.close();
	}

}
