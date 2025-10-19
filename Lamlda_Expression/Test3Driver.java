package com.LambdaExpression;

public class Test3Driver {
	static void fun(Test3 t,int p1,int p2) {
		t.print(p1,p2);
	}
public static void main(String[] args) {
	fun((p1,p2)->System.out.println(p1+" "+p2),10,20);
}
}
