package com.Polymorphism;

public class Overloading {
	
	static void show(int a,int b)
	{
		System.out.println("This is integer function");
	}
    static void show(double a,double b)
    {
    	System.out.println("This is double function");
    }
    public static void main(String[] args) {
    	Overloading.show(10, 20);
    	Overloading.show(1.2, 2.2);
	}
}
