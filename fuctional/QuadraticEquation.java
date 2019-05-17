package com.fuctional;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args)
	{
		   /** double a = 0;  // Double.parseDouble(args[0]);
	        double b = 1;  // Double.parseDouble(args[1]);
	        double c = 2;  // Double.parseDouble(args[2]);  */
		
		//  take user input for value a, b ,c
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of a:");
		double a= sc.nextInt();
		System.out.println("enter the value of b:");
		double b = sc.nextInt();
		System.out.println("enter the value of c:");
		double c= sc.nextDouble();
		
		// apply formula 
	        double delta = (b*b - 4*a*c);
	        if(delta>0)
	        {
	         double sqroot =  Math.sqrt(delta);
	         double root1 =(int) (-b + sqroot) / (2.0*a);
	         double root2 = (-b - sqroot) / (2.0*a); 
	         System.out.println(root1);
	         System.out.println(root2);
	        }
	        
	        else
	           {
	           System.out.println("Roots are imaginary");
	          
	           }
	        
	}

}
