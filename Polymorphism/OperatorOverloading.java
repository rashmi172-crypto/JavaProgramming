package com.Polymorphism;

public class OperatorOverloading {
	
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of two integer :" + sum);
	}
	void add(String s1,String s2)
	{
		String con=s1+s2;
		System.out.println("Addition of two String:" + con);
	}
	public static void main(String[] args) {
		OperatorOverloading obj=new OperatorOverloading();
		obj.add(10, 20);
		obj.add("Operator", " Overloading");
	}

}
