package com.myApp.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email: "+ theCoach.getEmail());
		
		System.out.println("team: "+ theCoach.getTeam());
		   
		//close context file
		context.close(); 
	}

}
