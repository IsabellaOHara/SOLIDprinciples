package com.qa.dependencyinversion;

public class Project {

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	public void doProject(Developer developer) {
		developer.writeCode(language);
	}
	
}
