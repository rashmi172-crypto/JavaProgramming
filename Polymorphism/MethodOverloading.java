package com.Polymorphism;

public class MethodOverloading {
	void show(int a) 
	{
	   System.out.println(a);	
	}
   void show(int a,int b)
   {
	   System.out.println("number1 :" + a + " number2 :" + b);
   }
   public static void main(String[] args) {
	   MethodOverloading obj = new MethodOverloading();
	   obj.show(10);
	   obj.show(10, 20);
	   
}
}
