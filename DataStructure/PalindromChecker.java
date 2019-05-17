package com.datastructure;

import java.util.Scanner;

import com.fuctional.Utility;

/**
* Purpose : construct an algorithm to input a string of characters and check whether it is a palindrome
* @author : ArjunRay
* @since : 21-04-2019
*/

public class PalindromChecker {
		
		public static void main(String[] args) 
		{
			CustomDequeue dq = new CustomDequeue();
			System.out.print("Enter a string to check poalindrome ");
			
			//Taking input string 
			Scanner sc = new Scanner(System.in);
			String palindrome = sc.nextLine();
		/*	String palindrome = Utility.inputSingleString(); */
			for (int i = 0 ; i < palindrome.length()-1 ; i++) 
			{
				String ch = String.valueOf(palindrome.charAt(i));
				dq.insertFront(ch);
			}
			boolean bol = false ;
			for (int i = 0 ; i < palindrome.length()-1 ; i++) 
			{
				if(String.valueOf(palindrome.charAt(i)).equals(dq.peakFront())) 
				{
					dq.removeFront();
					bol = true ;
				}
				else 
				
				{
					bol = false ;
					break;
				}
			}
			
			//Checking if the String is palindrome or not 
			
			if(bol)
			{
				System.out.println("String is palindrome ");
			}
			else 
			{
				System.out.println("String is not palindrome ");
			}
		}
	}


