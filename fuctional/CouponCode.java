package com.fuctional;

public class CouponCode 
{
	public static void main(String[] args)
	
	{
	// take random char 

	char[] ch = "gtgdyuyfyy".toCharArray();
       
    int max = 100000000;
    
     double randomnum =  (Math.random()*max);
     
      StringBuffer sb = new StringBuffer();
      
           while(randomnum>0) 
               { 
        	        sb.append(ch[((int)randomnum % ch.length)]);
        	       randomnum = randomnum/ch.length; 
        	        randomnum--; 
               }
           String str = sb.toString();

          System.out.println("random coupon is:"+ str);
}

}



