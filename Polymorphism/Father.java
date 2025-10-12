package com.Polymorphism;

public class Father extends Person {

	@Override 
	void role() {
		System.out.println("I am a father");
		super.role();
	}

}
