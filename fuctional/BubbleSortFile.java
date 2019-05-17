package com.fuctional;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BubbleSortFile

{   
		 public static void main(String[] args) throws IOException
		 
		 {
		      // take input file from computer
			 
			 File f=new File("/home/admin123/Arjun Bridgelabz program/Fuctional Bridgelabz program/src/com/pappu1.txt");
	         Scanner sc=new Scanner(f);
	          Scanner input=new Scanner(System.in);
	            int l=(int) f.length();
	            String s1[]=new String[l];
	            int c=0;
	            
	         while(sc.hasNext())
	         {
	             //System.out.println(sc.next());
	             String s=sc.next();
	             s1[c]=s;  
	             c++;
	         }
	         System.out.println("Before Sorting");
	         for(int i=0;i<c;i++) 
	         {
	         System.out.println(""+s1[i]);
	         }
	         
	         Utility1.sortingBeforeSearch(s1, c);
	        
	         
	         //After Sorting:
	          System.out.println("After Sorting");
	              for(int i=0;i<c;i++)
	              System.out.println(""+s1[i]);
	              int l1=s1.length;
	

          }
		 
}
