package com.racecar;

import java.util.List;

public class Car {

	private String name;
	private Engine engine;
	private List<Tire> tires;
	private float[] gearbox;
	private float differential;
	private int curGear;
	private boolean enginePowerStatus;
	

	public Car(String name, Engine newEngine, List<Tire> newTires, float[] newGearbox, float newDeifferential) {
		// TODO Auto-generated constructor stub

		this.name = name;
		this.engine = newEngine;
		this.tires = newTires;
		this.gearbox = newGearbox;
		this.differential = newDeifferential;
	}

	public String getName() {
		return name;
	}

	public boolean isEnginePowerStatus() {
		return enginePowerStatus;
	}

	public void carSpeed() {
		if(engine.getPowerStatus()) {
		System.out.println("Current speed is " + currentSpeed() + " mph "+ " @ " + engine.getRpm() + " rpm's");
		} else {
			System.out.println("Car is not started");
		}
	}
	
	private int currentSpeed() {
		// Velocity = (engine rpm * wheel tyre perimeter/336)/(gear ratio * axle ratio)
		return (int) (((engine.getRpm() * tires.get(1).getEffectiveDiameter()) / 336) / (gearbox[curGear] * differential));
	}

	public void start() {
		boolean tireCheck = true;
		int counter = 0;
		for (Tire x : tires) {
			if (32 > x.getTirePSI()) {
				tireCheck = false;
			}
			System.out.println("Tire #" + counter + " has a PSI of " + x.getTirePSI());
			counter++;
		}
		if(tireCheck) {
			System.out.println("Tire check passed. Starting car!" );
			engine.setRpm(2000);
			enginePowerStatus = engine.setPowerStatus(true);
		}
	}

	public void stop() {
		engine.setRpm(0);
		enginePowerStatus = engine.setPowerStatus(false);
	}

	public void shiftUp() {
		System.out.println("Shifted up!");
		curGear++;
	}

	public void shiftDown() {
		System.out.println("Shifted Down!");
		curGear--;
	}
	
	public void revUp(int rev) {
		engine.setRpm(engine.getRpm() + rev);
	}
	
	public void revDown(int rev) {
		engine.setRpm(engine.getRpm() - rev);
	}

	public void update() {
		
	}

}
