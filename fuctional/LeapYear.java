package com.fuctional;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args)
	   {
            // take input from user 
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter your year:");
			 int year=sc.nextInt();

			 		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))  // logic for leap year
			 		{ 
			 		System.out.println("This is leap year"+ year);
			 		}
			 		
			 else   {
			 	System.out.println("This is not leap year"+year);
			        }
		}

}
