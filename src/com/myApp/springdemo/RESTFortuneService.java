package com.myApp.springdemo;

import org.springframework.stereotype.Component;

@Component("foo")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "RESTFortune getDailyFortune";
	}

}
