package com.fuctional;

import java.util.Scanner;

public class FindDistance 
{
	
	public static void main(String[] args) 
	
	{
	Scanner sc = new Scanner(System.in);
	  
	System.out.println("Enter x1 value:"); 
	 
	
	// take input from user
	double x=0,y=0;
	
	double x1= sc.nextInt();
	
	System.out.println("enter y1 value");
	 double y1 = sc.nextInt();
	 
		   // int x=6; //Integer.parseInt(args[0]);
		  
		   // int y=5;  //Integer.parseInt(args[1]);
		    //  apply formula
	 
		    double distance=Math.sqrt(Math.pow(x-x1, x)+Math.pow(y-y1, y));
		    
		    System.out.println("Distance From (x,y) to (x1,y1) is "+distance);
	}


}
