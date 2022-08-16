package com.qa.singleresponsibility;

public class Car {

	private String colour;
	private String make;
	private int mileage;
	
	
	public Car(String colour, String make, int mileage) {
		this.colour = colour;
		this.make = make;
		this.mileage = mileage;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	
	
}
