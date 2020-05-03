package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from application container

		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkOut());

		// close the context
		context.close();

	}

}
