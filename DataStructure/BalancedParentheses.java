package com.datastructure;

public class BalancedParentheses {
	public static void main(String[] args) {
		System.out.println("Enter the expression ");
		
		//Taking expression as an input
		
		String expression = Utility.inputSingleString();
		
		//Checking if expression is balanced 
		
		boolean status = DSUtility.check(expression);
		if(status) {
			System.out.println("The expression is balanced");
		}
		else {
			System.out.println("The expression is not balanced");
		}
		
		//Clossing Scanner
		
		Utility.closeScanner();
}
}
