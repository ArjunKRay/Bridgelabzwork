package com.fuctional;


public class SumOf3Integer
{
	
	public static void checkTripalateSum(int[]arr) // method for check tripalate num zero
	   { 
		   for(int i =0; i<arr.length; i++)
	   {
	    	for(int j=i+1;j<arr.length; j++)
	    	{
	    		for(int k=j+1;k<arr.length;k++)
	    		{ 
	    			if(arr[i]+arr[j]+arr[k]==0) 
	    					
	    			{
	    				System.out.println(arr[i]+""+arr[j]+""+arr[k]);
	    	                 break;
	    			}  
	    			else 
	    			{
	    				System.out.println("num not found");
	    			}
	    		}
	    		
	    	}
	    }
	     	
	    
	   }
		      
	 


	public static void main(String[] args) {
		
		
		int[] arr = {4,-5,8,-5,56,-85,36,81,32,5};
		SumOf3Integer  tz = new SumOf3Integer ();
		tz.checkTripalateSum(arr);
	}


}
