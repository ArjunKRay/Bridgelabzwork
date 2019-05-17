package com.fuctional;

import java.util.Scanner;

public class BinaryNum
{
	
	public static void  main(String args[])
	
	{
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("enter.your num:");
	      //takes the command line argument from user
	     // int number = Integer.parseInt(args[0]);
	      
	      int number1 = sc.nextInt();
	      int rem;
	      
	     String bin[]={"0","1"};
	      { 
	    	  String binary="";
	      
	    	  while(number1>0) 
	        {
	        rem=number1%2;
	        binary=bin[rem]+binary;
	        number1=number1/2;
	         }
	   System.out.println(binary);
	     }
	          
	      
	}
	
}
