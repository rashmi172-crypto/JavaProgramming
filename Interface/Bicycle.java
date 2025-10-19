package com.Interface;

public class Bicycle implements Vehicle {
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newgear)
	{
		gear=newgear;
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
