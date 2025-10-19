package com.LambdaExpression;

public class ParameterDriver {
	public static void main(String[] args) {
		WithParameter add=(int a,int b)->a+b;
		WithParameter multiply=(a,b)->a*b;
		System.out.println(add.operation(5, 6));
		System.out.println(multiply.operation(5, 8));
	}

}
