package com.fuctional;



public class StopWatch 
{
	
	public static void stopwatchSimulator() 
	{
		long startTime = System.currentTimeMillis();  // take current time
		for (int i = 0; i < 1000;i++ )
		{
			System.out.println();
		}
		long stopTime = System.currentTimeMillis();
		long Time = stopTime - startTime;
		System.out.println("Total time required" + Time);
		
	    
	}
	
	// driver method
	public static void main(String[] args) 
	{
		
		StopWatch.stopwatchSimulator();

	}

}
