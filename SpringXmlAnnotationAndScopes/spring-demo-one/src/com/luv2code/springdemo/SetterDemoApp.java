package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		// retrieve the bean from spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean

		// close the context
		context.close();

	}

}
