package com.fuctional;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class InserttionSortFile

{
	
	
	public static void main(String[] args) throws IOException 
	{
		// take file from computer 
		
		File f=new File("/home/admin123/pappu1");
		 Scanner sc=new Scanner(f);
		 
		 String str[]=new String[(int)f.length()];
		 int c=0;
		 while(sc.hasNext())
		 {
			 String s=sc.next();
			 
			 
			 System.out.println(s);
			 str[c]=s;
			 c++;
			 
			 }
		 
		 // before sorting 
		 
		 for(int i=0;i<c;i++) {
			 System.out.println(str[i]);
			 
			 
			 
			 
		 }
		   Utility1.insertionSort(str); // call utility method
	         
	         //After Sorting:
	          System.out.println("After Sorting");
	              for(int i=0;i<str.length;i++)
	              System.out.println(""+str[i]);
	              int l1=str.length;
		
		
		   }
		
	         

          
}

        


