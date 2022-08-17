package com.qa.liskov;

public class Penthouse extends Apartment implements BedroomAdder {

	
	
	public Penthouse(int numberOfBedrooms, int squareFootage) {
		super(numberOfBedrooms, squareFootage);
	}

	public void addBedroom() {
		this.setSquareFootage(getSquareFootage() + 40);
		this.setNumberOfBedrooms(getNumberOfBedrooms() + 1);
	}

	

	
	
}
