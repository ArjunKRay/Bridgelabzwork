package com.fuctional;

import java.util.Scanner;

public class HarmonicNum {
	
	public static void main(String[] args)
	
	{
		// take  input from user
		   System.out.print("Enter any number : ");
		   
	        Scanner s = new Scanner(System.in);
	        int num = s.nextInt();
	        double result = 0.0;
	       
	        // code for harmonic num
	        while(num > 0)
	          {
	               result = result + (double) 1 / num;
	               num--;
	               System.out.print(result +"  ");
	          }
	        System.out.println("");
	        System.out.println(" Harmonic Series is "+result);
		
	}
}
