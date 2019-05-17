package com.fuctional;

import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args) 
	{
		// take user input 
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter the temperature t and speed v");
		System.out.println("Enter t value more than 50");
		
		System.out.println("Enter v value more than 3 and less than 120");
		
		double t=sc.nextInt();
	
		double v=sc.nextInt();
		//  apply formula
		
		double f=Math.pow(v, 0.16);
		if(t>50 && v<120 && v>3)
		{
			double w=35.74+0.6215*t+((0.4275*t)-35.75)*f;
			System.out.println("The temperature of windchill "+w);
		}
		else
		System.out.println("ondition check kar ke value daliye mohtaramac");
	}

}
