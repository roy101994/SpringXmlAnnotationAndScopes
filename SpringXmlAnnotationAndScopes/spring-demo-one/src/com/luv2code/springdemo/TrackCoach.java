package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailFortune() {
		// TODO Auto-generated method stub
		return "Just do it" + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartUpStuff() {
		System.out.print("Track Coach:inside my startup method");
	}

	// add a destroy method

	public void doMyCleanUpStuff() {

		System.out.print("Track Coach:inside my clean up method");
	}
}
