package com.racecar;

public class Tire {
	private String brand;
	private float width;
	private float height;
	private float aspect;
	private float tirePSI;
	private float ware;
	private float effectiveDiameter;

	public Tire(String brand, float... fs) {
		this.brand = brand;
		this.width = fs[0];
		this.height = fs[1];
		this.aspect = fs[2];
		this.tirePSI = fs[3];
		this.ware = fs[4];
		setDiameter();
	}

	public void tireController() {
		/*
		 * This would control access to private variable
		 * since this is just an example i'm leaving it out.
		 */
	}


	/* Getters */
	public String getBrand() {
		return brand;
	}

	public float getTirePSI() {
		return tirePSI;
	}

	public float getWare() {
		return ware;
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	public float getAspect() {
		return aspect;
	}

	public float getEffectiveDiameter() {
		return effectiveDiameter;
	}

	// Set diameter
	private void setDiameter() {
		this.effectiveDiameter = (float) ((((this.width * this.aspect) / 25.2) * 2) + this.height);
	}
}
