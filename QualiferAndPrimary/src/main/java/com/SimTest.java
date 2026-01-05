package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimTest {
	@Autowired
	@Qualifier("airtel")
	private Sim sim;
	public void callSim()
	{
		sim.m1();
	}
}
