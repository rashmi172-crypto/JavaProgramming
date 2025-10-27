package BasicsCalculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		System.out.println("This is basics calculator "
				+ "which perform only +,-,*,/");
		Scanner sc=null;
		
		try {
		sc=new Scanner(System.in);
		
		System.out.println("Enters the numbers ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		System.out.println("Enter the operator (+,-,*,/)");
		char op=sc.next().charAt(0);
		double o=0;
		switch(op) {
		case '+':
			o=num1+num2;
			break;
		case '-':
			o=num1-num2;
			break;
		case '*':
			o=num1*num2;
			break;
		case '/':
			o=num1/num2;
			break;
		default:
			System.out.println("you Enter wrong input");
		}
		System.out.println("The Final Result is: ");
		System.out.println();
		
		System.out.println(num1 + " "+ op + " "+ num2+ "="+o);
		} catch(Exception e) {
			e.printStackTrace();
			} finally {
				sc.close();
			}
	}
		

}


