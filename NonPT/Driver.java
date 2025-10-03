package com.NonPT;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("====Welcome to Maharashtara Cab Service===");
		System.out.println("====Press 1 for Mini====");
		System.out.println("====Press 2 for sedan====");
		System.out.println("====Press 3 for Suv====");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Cab c=null;
		switch(choice)
		{
		case 1:{
			c=new Mini("Arjun",3245,"white",9823155406L,"wagnor",4,121,120);
			Mini m=(Mini)c;
			m.carDetails();
			break;
		}
		case 2:{
			c=new Sedan("Karan",3286,"Red",7875309455L,"Etios",5,150,150);
			Sedan s=(Sedan)c;
			s.carDetails();
			break;
		}
		case 3:{
			c=new Suv("Sachin",9735,"Black",837686566L,"Etriga",7,200,180);
			Suv sv=(Suv)c;
			sv.carDetails();
			break;
		}
		default:
			System.out.println("choose crt option.....");
		}
		
	}

}
