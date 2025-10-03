package com.NonPT;

public class Sedan extends Cab {
	{
		System.out.println("====your sedan is Booked====");
	}
	
	String sedan_brand;
	int seats;
	double fair;
	double boot_space;
 Sedan(String cab_driver_name, int cab_no, String color, long phno,
		 String sedan_brand,int seats, double fair,double boot_space )
 {
	super(cab_driver_name,cab_no,color,phno);
	this.sedan_brand=sedan_brand;
	this.seats=seats;
	this.fair=fair;
	this.boot_space=boot_space;
 }
public void carDetails() {
	System.out.println("cab Driver Name :" + cab_driver_name);
	System.out.println("cab number :" + cab_no);
	System.out.println("cab color :" + color);
	System.out.println("Drive Phone number :" + phno);
	System.out.println("car Brand :" + sedan_brand);
	System.out.println("Seats :" + seats);
	System.out.println("Fair :" + fair);
	System.out.println("Boot Space :" + boot_space);
}
	
	
}
