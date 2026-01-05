package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Jio implements Sim {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("jio");
	}
	
	
}
