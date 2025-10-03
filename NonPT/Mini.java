package com.NonPT;

public class Mini extends Cab {
	{
		System.out.println("====your mini is book====");
	}
  String mini_brand;
  int seats;
  double fair;
  double boot_space;
  
  Mini (String cab_driver_name, int cab_no, String color, long phno,
		  String mini_brand, int seats, double fair, double boot_space)
  {
	  super(cab_driver_name,cab_no,color,phno);
	  this.mini_brand=mini_brand;
	  this.seats=seats;
	  this.fair=fair;
	  this.boot_space=boot_space;
  }
  public void carDetails() {
		System.out.println("cab Driver Name :" + cab_driver_name);
		System.out.println("cab number :" + cab_no);
		System.out.println("cab color :" + color);
		System.out.println("Drive Phone number :" + phno);
		System.out.println("car Brand :" + mini_brand);
		System.out.println("Seats :" + seats);
		System.out.println("Fair :" + fair);
		System.out.println("Boot Space :" + boot_space);
}
}
  
  


