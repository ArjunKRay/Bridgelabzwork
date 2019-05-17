package com.fuctional;

import java.util.Scanner;

public class PowerOf2 {
	
	static boolean checkPowerOfTwo(int num) // method for check power of two
	 { 
	     
	    	return	 (int)(Math.ceil((Math.log (num)/ Math.log(2))))  
	         == (int)(Math.floor(((Math.log(num) / Math.log(2)))));
	         
	 } 
	 public static void main(String[] args) 
	 {  
		 // take user input  
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your num:");
		 int num = sc.nextInt();
	     if (checkPowerOfTwo(num)) 
	          {  
	    	 
	    	 System.out.println("This num is power of Two"); 
	         
	          }
	     else
	       {
	    	 System.out.println(" This num is not power of Two"); 
	       }

	     
	 } 

	

}
