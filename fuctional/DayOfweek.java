package com.fuctional;

import java.util.Scanner;

public class DayOfweek 

{ 
public static void  main(String[] args)
	
	{
	
	  /**  int m = 0;  //Integer.parseInt(args[0]);
	    int d = 1;   //Integer.parseInt(args[1]);
	    int y = 2;  //Integer.parseInt(args[2]); **/
	    
	Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter the value of y,m,d:");
	     int y= sc.nextInt();
	     int m =sc.nextInt();
	     int d = sc.nextInt();
	     
	     // take  days of week
	  String [] days  = {  "Sunday","Monday","Tuesday","Wendsday","Thusday","Friday","Saturday"};
		
	    int m0,y0,d0 = 0,x;
	    
	    //Apply formula
	    
	   try 
	      { y0=y-(14-m)/12;
	    
	       x  = y0+y0/4-y0/100+y0/400;
	    
	       m0 = m+12*((14-m)/12)-2;
	    
	         d0 = (d+x+(31*m0)/12)%7;
	         
	         System.out.println(days[d0]); 
	         return;  // if we not used return then this also print index value of days
	         }
	    catch(ArithmeticException e)
           { 
	    	System.out.println(e);
           
             }
	    System.out.println(d0);
	}


}
