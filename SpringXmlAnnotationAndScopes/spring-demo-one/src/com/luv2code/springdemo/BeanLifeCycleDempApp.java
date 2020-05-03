package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDempApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// retrieve the new bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.print(theCoach.getDailyWorkOut());
		context.close();

	}

}
