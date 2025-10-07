package MethodOverriding;

public class ParentDriver {
	public static void main(String[] args) {
		Parent a;
		a=new Child();
		a.Print();
		
		a=new Child1();
		a.Print();
		
	}

}
