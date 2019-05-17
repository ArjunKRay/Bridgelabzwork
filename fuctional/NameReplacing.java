package com.fuctional;

import java.util.Scanner;

public class NameReplacing

{
	
public static void main(String[] args)
	
	{       // take input from user
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your name:");
			String name  = sc.nextLine();
			int length = name.length();
			    
			if(length>3) 
			    	
			    {
		           System.out.println("Hello"+name+"How are you");
			    }
			    
			else {
				System.out.println("janab 3 charecter se jada daliye");
			   
			    }
	    }

}
