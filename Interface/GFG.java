package com.Interface;

public class GFG implements B{
	public void method1() {
		System.out.println("Method 1");
	}
	public void method2() {
		System.out.println("Method 2");
		
	}
	public void method3() {
		System.out.println("Method 3");
	}
 public static void main(String[] args) {
	GFG g=new GFG();
	g.method1();
	g.method2();
	g.method3();
}
}
