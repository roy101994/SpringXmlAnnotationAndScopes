package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// retrieve the new bean
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are same

		boolean result = (theCoach == alphaCoach);

		// print the Results
		System.out.print("\nPointing to the same Object\n" + result);
		
		System.out.print("\nMemory localtion for the COach"+theCoach);
		
		System.out.print("\nMemory localtion for the COach"+alphaCoach);

	}

}
