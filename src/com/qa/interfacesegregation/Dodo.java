package com.qa.interfacesegregation;

public class Dodo implements ExtinctCreature, EggLayingCreature {

	@Override
	public void haveOffspring() {
		System.out.println("a baby dodo!");
		
	}

	@Override
	public void dead() {
		System.out.println("r.i.p.");
		
	}

}
