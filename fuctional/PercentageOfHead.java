package com.fuctional;



public class PercentageOfHead {
	
	public static void main(String[] args)
	{
		int n =10;   //Integer.parseInt(args[0]);
	       int countHead=0,countTail=0;
	       double percentH = 0,percentT = 0;
	       
	 
	       for(int i=0;i<n;i++) 
	       {
	         if(Math.random()<0.5)  // random method give value from 0 to 1
	         { 
	          System.out.println("Head");
	          countHead++;
	         } else
	           {                   
	           System.out.println("Tails");
	           countTail++; 
	           }
	       }
	       // Calculating percentage
	      try 
	      { percentH=(countHead*100)/n;
	       percentT=(countTail*100)/n;
	       }
	      catch(ArithmeticException e) 
	      {
            System.out.println(e);
            }
	      
	       System.out.println("Percentage of Tail="+percentT+"\nPercentage of Heads="+percentH);

	}


}
