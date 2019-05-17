package com.fuctional;

import java.io.*;


import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class BinnarySearchFile  


{
	
	
	 public static void main(String[] args) throws IOException
	 
	 {
      // take file from computer
		 
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
         
         Utility1.sortingBeforeSearch(s1, c);  // call  utility method for sorting 
        
         
         //After Sorting:
          System.out.println("After Sorting");
              for(int i=0;i<c;i++)
              System.out.println(""+s1[i]);
              int l1=s1.length;
              //Searching 
              System.out.println("Enter to search:");
              String search=input.nextLine();
              Utility1.binarySearch(s1, search,c);
       
         
  
	 }
	 
	 
 }
 



