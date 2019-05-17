package com.fuctional;

import java.util.Scanner;

public class ChangeNibble 
{
	
	public static void  main(String args[]) 
	
	{
	       
	      //takes the command line argument from user
	      //  int number = Integer.parseInt(args[0]);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your num:");
		
		int number = sc.nextInt();
		
		
	      int rem;
	      String nibbel1[]={"0","1","2","3"}; // range of base argument 
	      String nibbel="";
	      
	    // method for change value from  decimal to nibble
	      while(number>0) 
	      {
	        rem=number%4;
	        nibbel=nibbel1[rem]+nibbel;
	        number=number/4;
	      }
	   System.out.println(nibbel);
	}

}
