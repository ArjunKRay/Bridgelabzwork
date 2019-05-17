package com.fuctional;

import java.util.Scanner;

public class Note 

{
	
public static void main(String[] args) 

{           // take user input 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("chhute ke liye Ruppeya daliye janab:");
		
		int change = sc.nextInt();
		//   int change=0; //Integer.parseInt(args[0]);
		
		int notes[]={2000,500,200,100,50,10,2,1}; // note for change
		int noteCounts[]=new int[notes.length];
		Utility1.returnNotes(noteCounts,change,0);  // call utility method 
		
		for(int i=0;i<notes.length;i++){
			if(noteCounts[i]!=0)
				System.out.println(notes[i]+" Apke chhute ye hai = "+noteCounts[i]); // print change
		}
		
	}

}
	


