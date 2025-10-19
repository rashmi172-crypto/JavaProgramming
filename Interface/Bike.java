package com.Interface;

public class Bike implements Vehicle {
	int gear;
	int speed;
	
	@Override
	public void changeGear(int newGear)
	{
		gear=newGear;
	}
	@Override
	public void speedUP(int increment)
	{
		speed=speed+increment;
		
	}
	@Override
	public void applyBrakes(int decrement)
	{
		speed=speed-decrement;
	}
	public void printDetails() {
		System.out.println("Speed :" + speed + "Gear :" + gear);
	}
	

}
