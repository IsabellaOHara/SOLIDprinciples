package com.qa.dependencyinversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void writeCode(String language) {
		System.out.println("Javascript is used everywhere anyway");
		
	}

}
