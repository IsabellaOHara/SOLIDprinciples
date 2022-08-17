package com.qa.openclosed;

public class Runner {

	public static void main(String[] args) {

		FormalGreeting f = new FormalGreeting();
		CasualGreeting c = new CasualGreeting();
		
		Greeter greeter = new Greeter(f);
		
		System.out.println(greeter.greet());
		
	}

}
