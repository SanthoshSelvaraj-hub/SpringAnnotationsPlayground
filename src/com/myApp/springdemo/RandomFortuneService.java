package com.myApp.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data= {
			"Beware of the wolf in sheep's costume",
			"Deligence is the mother of good luck",
			"The journey is in the reward"
	};
	
	private Random myRandom = new Random();
	
	
	@Override
	public String getDailyFortune() {
		
		int index = myRandom.nextInt(data.length);
		String thefortune = data[index];
		return thefortune;
	}

}
