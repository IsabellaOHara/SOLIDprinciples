package com.qa.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		
		Car merc = new Car("Sliver", "Mercedes", 3000);
		Driver speedy = new Driver();
		Mechanic fixer = new Mechanic();
		
		System.out.println("Current mileage: " + merc.getMileage());
		
		speedy.drive(merc, 400);
		
		System.out.println("New mileage: " + merc.getMileage());
		
		fixer.setCar(merc);
		
		System.out.println("Original colour: " + merc.getColour());
		
		fixer.repaint("Red");
		
		System.out.println("New colour: " + merc.getColour());
		
		fixer.changeTyres();
		
	}
	
}
