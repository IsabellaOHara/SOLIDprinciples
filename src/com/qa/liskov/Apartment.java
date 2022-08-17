package com.qa.liskov;

public class Apartment {

	private int numberOfBedrooms;
	private int squareFootage;
	
	
	public Apartment(int numberOfBedrooms, int squareFootage) {
		super();
		this.numberOfBedrooms = numberOfBedrooms;
		this.squareFootage = squareFootage;
	}


	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}


	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}


	public int getSquareFootage() {
		return squareFootage;
	}


	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}
	
	
	
}
