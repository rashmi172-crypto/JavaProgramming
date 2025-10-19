package com.LambdaExpression;

public class Test2Driver {
	static void fun(Test2 t,int p) {
		t.print(p);
	}
public static void main(String[] args) {
		fun(p->System.out.println(p),10);
}
}
