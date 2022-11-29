package com.spring.demo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Track Coach";
	}

	@Override
	public String getDailyFourtune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("This is init-method haha");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy for prototype");

	}
}
