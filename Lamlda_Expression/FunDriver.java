package com.LambdaExpression;

public class FunDriver {
	public static void main(String[] args) {
		FuncInterface fobj=(int x)->System.out.println(x*5);
		fobj.fun(5);
		fobj.normalFun();
		
	}

}

