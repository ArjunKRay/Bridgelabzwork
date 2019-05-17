package com.fuctional;

import java.util.Scanner;

public class Square 

{
	public static void main(String[]args)
     {  
		// take user input 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your the value of t:");
	    //double c = 0;  //Double.parseDouble(args[0]);
    double c= sc.nextDouble();
    // apply formula 
      double epslion=(1e-15);
       double t=c;

      while(Math.abs(t- c/t)> epslion*t)
      {
        t=(c/t+t)/2;
       }
 
     System.out.println(t);

  }

}
