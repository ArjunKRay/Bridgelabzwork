package com.fuctional;

import java.util.Scanner;

public class Palidrom 
  {
	
	public static void main(String[] args) 
	{   // take user input for check palindrom
	       String str, reverse = "";
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        str = sc.nextLine();
	  
	        for(int i =str.length()-1 ; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        if(str.equalsIgnoreCase(reverse))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	}


}
