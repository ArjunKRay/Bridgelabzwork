package com.fuctional;

import java.util.Scanner;

public class PrimeFactor 
  {
	
public static void main(String[] args)
   
    {
		
		// int n = 0;  //Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter your num:");
         
         int num = sc.nextInt();
	       

	        // for each potential factor
	        for (int factor = 2;factor <=num; factor++) 
	        {

	            // if factor is a factor of n, repeatedly divide it out
	            while (num % factor == 0) 
	            {
	                System.out.println(factor+""); 
	                num = num / factor;
	                
	            }
	        
	        }
	       
	}

}
