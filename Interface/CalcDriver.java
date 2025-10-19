package com.Interface;

public class CalcDriver {
	public static void main(String[] args) {
		Calc c=new Calc();
		System.out.println("Addition :" + c.add(10, 5));
		System.out.println("Subtraction :" + c.sub(10, 5));
	}

}
