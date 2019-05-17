package com.fuctional;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) 
	{
		// take user input 
		 Scanner sc = new Scanner(System.in);
	      
         System.out.println("enter your num:");
          
       int num = sc.nextInt();
       int temp=0;
       
         for(int i=2;i<num;i++)
              {
                 if (num% i==0)
                    {  
               	    temp +=1;    
                    }
       
	            }
        if(temp==0) 
              {
              System.out.println("This is prime num:"+num);
              }
        else { 
       	    System.out.println("This is not prime num:"+num);
              }
	}

	

}
