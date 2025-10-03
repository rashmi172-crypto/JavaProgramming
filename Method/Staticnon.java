package com.Method;

public class Staticnon {
	static int a=100;
	static String b="Hello Wolrd!";
	
	public static void display() {
		System.out.println("number is :" + a);
		System.out.println("String is :" + b);
	}
	public void nonStatic() {
		display();
	}
public static void main(String[] args) {
	Staticnon obj=new Staticnon();
	obj.nonStatic();
	display();
}
}
