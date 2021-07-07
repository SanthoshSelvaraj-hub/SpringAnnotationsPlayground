package com.myApp.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("Tennis Coach: In default constructor");
	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Tennis Coach: In setter method setFortuneService.");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("Tennis Coach: In method doSomeCrazyStuff.");
//		this.fortuneService = fortuneService;
//	}
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Tennis Coach: Doing Startup stuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Tennis Coach: Doing Cleanup stuff");
	}


}
