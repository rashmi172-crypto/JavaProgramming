package com.Method;

public class Static {
	
	static int a = 40;
	       int b = 50;
	void simpleDisplay() {
		System.out.println(a);
		System.out.println(b);
	}
   static void staticDisplay() {
	   System.out.println(a);
	     
   }
public static void main(String[] args) {
	Static obj=new Static();
	obj.simpleDisplay();
	staticDisplay();
}
}
