package com.Interface;

public class VehicleDriver {
	public static void main(String[] args) {
		
		
		Bicycle bicycle=new Bicycle();
		bicycle.applyBrakes(1);
		bicycle.changeGear(2);
		bicycle.speedUP(3);
		System.out.println("Bicycle Present State: ");
		bicycle.printDetails();
		
		Bike bike=new Bike();
		bike.applyBrakes(3);
		bike.changeGear(1);
		bike.speedUP(4);
		System.out.println("Bike Present State: ");
		bike.printDetails();
		
		
	}

}
