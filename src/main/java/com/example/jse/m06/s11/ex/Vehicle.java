package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: it should steer left/right, it should brake
public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    public Vehicle() {
        log.info("Vehicle created");
    }
    public void steer(boolean left) {
    	if (left)
    		System.out.println("turn left");
    	else
    		System.out.println("turn right");
}
    public void brake() {
    	System.out.println("brake");
		// TODO Auto-generated method stub

	}
}