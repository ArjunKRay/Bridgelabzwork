package com.fuctional;



public class Gambler {
	
	public static void main(String[] args)
	{
		  int stake  =1; // Integer.parseInt(args[0]);   
	        int goal   =2; // Integer.parseInt(args[1]);    
	        int trials =3; // Integer.parseInt(args[2]); 
			

	        int bets = 0;       
	        int wins = 0;      

	       
	        for (int t = 0; t < trials; t++)  // repeat trials times
	        {

	            int cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;      
	                
	                if (Math.random() < 0.5)
	                	{
	                	cash++;   // win 1$
	                	}
	                else 
	                   {
	                	cash--;  //loss 1$    
	                   }
	            }
	            if (cash == goal)
	            	{
	            	wins++;    // win the game            
	                }
	        
	        }
// print result 
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);	

	}

}
