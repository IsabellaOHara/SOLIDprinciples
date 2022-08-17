package com.qa.interfacesegregation;

public class Falcon implements EggLayingCreature, FlyingCreature{

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
		
	}

	@Override
	public void haveOffspring() {
		System.out.println("little baby falcon!");
		
	}

}
