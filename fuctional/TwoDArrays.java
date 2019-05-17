package com.fuctional;

import java.util.Scanner;

public class TwoDArrays {
	
	public static void main(String[] args) 
	{
		// take user input for row and column
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter row and col");
              int row = sc.nextInt();
              int column = sc.nextInt();
            
             int [][] arr = new int[row][column];
            System.out.println("enter values");
                for(int i=0;i<row;i++)
               {
            	   for(int j=0;j<column;j++)
            	   {
            		arr[i][j]=sc.nextInt();
            	   }
            }  
            for(int[] var:arr)  // print arrays
             {
            	for(int var1:var) 
            	{
            	System.out.print(var1+" ");
                }
	         }
	}


}
