package com.qa.singleresponsibility;

public class Mechanic {

	private Car car;
	
	
	public void setCar(Car car) {
		this.car = car;
	}

	public void repaint(String newColour) {
		car.setColour(newColour);
	}
	
	public void changeTyres() {
		System.out.println("Your " + car.getMake() + " has new tyres!");
	}
	
	
	
}
