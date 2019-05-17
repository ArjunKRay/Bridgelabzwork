package com.fuctional;

import java.util.Scanner;

public class TempConversion {
	
	public static void main(String[] args)
	{
		// take user input 
		
       Scanner sc= new Scanner(System.in);
       System.out.println("enter fahrenhite value for conversion:");
       
       double f = sc.nextDouble();
		 //double fahrenhite =Double.parseDouble(args[0]);
	    //converting into celcius
// apply formula
       double celsius=(f-32)*5/9;
	    System.out.println(celsius+" C");
	}

}
