package com.racecar;

public class Engine {
	
	private String name;
	private int horsePower;
	private int mpg;
	private int rpm;
	private boolean powerStatus;
	
	public Engine(String newName, int newHosrsePower, int newMPG, int newRPM ){
		this.name = newName;
		this.horsePower = newHosrsePower;
		this.mpg = newMPG;
		this.rpm = newRPM;
	}

	public String getName() {
		return name;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public int getMpg() {
		return mpg;
	}

	public int getRpm() {
		return rpm;
	}
	
	public void setRpm(int i) {
		this.rpm = i;
	}
	
	public boolean getPowerStatus() {
		return this.powerStatus;
	}
	
	public boolean setPowerStatus(boolean powerState) {
		this.powerStatus = powerState;
		System.out.println("Car is turned on: " + powerStatus + " || Engine @ " + this.rpm + " rpm's");
		return this.powerStatus;
	}

}
