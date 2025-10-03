package com.Method;

public class NonStatic {
	public void hello() {
		System.out.println("This is not static method");
	}
public static void main(String[] args) {
	NonStatic obj=new NonStatic();
	obj.hello();
}
}
