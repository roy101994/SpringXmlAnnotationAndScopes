package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.print("Cricket Coach:inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
