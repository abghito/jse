package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
public class Car implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    public Car() {
        log.info("Car created");
    }
    @Override
	public void setTemperature(int temp) {
		System.out.println(temp);
		
	}
}
