package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		SimTest simTest = applicationContext.getBean(SimTest.class);
		simTest.callSim();
		
	}

}
