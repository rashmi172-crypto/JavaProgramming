package MethodOverriding;

public class TestDriver {
public static void main(String[] args) {
    Test ref;
    ref=new Test();
    ref.m1();
    ref=new ClassC();
    ref.m1();
    ref=new ClassD();
    ref.m1();
	
}
}
