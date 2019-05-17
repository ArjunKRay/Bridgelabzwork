package com.fuctional;

import java.util.Arrays;

public class Anagram 

{    
	//  method used for anagram
		public static boolean isAnagram(String str1, String str2) {
			boolean isAnagram = true;
			char arr1[] = str1.toLowerCase().toCharArray();
			char arr2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (arr1.length != arr2.length) {
				return false;
			} else {
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i] == arr2[i]) {
						isAnagram = true;
					} else {
						isAnagram = false;
						break;
					}

				}
			}
			return isAnagram;
		}
// end method 
		 
		// method start  for  palindrome
		
		public static boolean isPalindrome(String str) {
			char arr[] = str.toLowerCase().toCharArray();
			boolean isPalindrome = true;
			int j = arr.length - 1;
			for (int i = 0; i < arr.length; i++, j--) {
				if (arr[i] == arr[j]) {
					isPalindrome = true;
				} else {
					isPalindrome = false;
					return isPalindrome;
				}
			}
			return isPalindrome;

		}
// end method
		
		public static boolean isPrime(int number) {

			// condition to check if no less than two
			if (number < 2) {
				return false;
			}

			// for loop to for checking prime no
			for (int factor = 2; factor <= number; factor++) {
				// if factor divides evenly into n, n is not prime, so break out of
				// loop
				if (number % factor == 0) {
					return false;

				}
			} // End of for loop
			return true;
		}

		public static void printPrimes() 
		{
			int number = 0;
			for (number = 0; number <= 1000; number++) 
			{ 
				
				if (isPrime(number)) 
				{			
											
					         System.out.println(number);				         				
				}
			}
		}

		
		public static void printPrimePalindrome()   
		{
			for (int number = 2; number < 1000; number++)
			{
				if (isPrime( (number))) 
				{
					if (isPalindrome(Integer.toString(number)))
					{	
						System.out.println(number);
						
						}
				    }
			    } 
			}

							

		/**
		 * @ driver code
		 */
		public static void main(String[] args) 
		{
			
			printPrimePalindrome();
			
		}

	}



