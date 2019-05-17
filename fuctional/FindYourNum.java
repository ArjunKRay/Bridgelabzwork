package com.fuctional;

import java.util.Scanner;

public class FindYourNum 
  
   {
	
   public  void findMaxNumAtPoss(int[]arr,int k)

// start code for max num at position
	
	{  
		
		int temp;
		  for(int i= 0; i<arr.length-1;i++)
              
		     { for(int j=i+1;j<arr.length;j++) 
                 
                { if(arr[i]>arr[j]) 
                     
                    {
			            temp=arr[i];
			            arr[i]=arr[j];
			            arr[j]=temp; 
                    }
                	 
                if(i==k-1) 
                 {
                	System.out.println("position element is:"+arr[i]);
                	break;
                 }
                
		        }
		     }
		  System.out.println("...........");
		  for(int i =0; i<arr.length;i++)
		  {
			System.out.println(arr[i]);
			  
		  }
			  
			  
	}
// end method

   // start method for min num at pos
   
public  void findMinNumAtPoss(int[]arr,int k)
	
	{  
		
		int temp;
		  for(int i= 0; i<arr.length-1;i++)
              
		     { 
			  for(int j=i+1;j<arr.length;j++) 
                 
                {
				  if(arr[i]<arr[j]) 
                     
                    {
			            temp=arr[i];
			            arr[i]=arr[j];
			            arr[j]=temp; 
                    }
                	 
                if(i==k-1) 
                 {
                
                	System.out.println("position element is:"+arr[i]);
                	break;
                 }
                
		     }
		 }
		  System.out.println("........");
		  
		 for(int i=0;i<arr.length;i++);
	}

// driver code 
	public static void main(String[] args) {
		
	    int[] arr = {12,45,65,48,75,10,35,41,98,11};
	      
	    Scanner sc = new Scanner(System.in);
	      
		 System.out.println("Enter your Position for find Num:");
		      int k = sc.nextInt();
		         
		      FindYourNum fb =new FindYourNum();
		      System.out.println("enter your choice:");
		      int choice = sc.nextInt();
		      switch(choice) 
		         {
		           
		      case 1: fb.findMaxNumAtPoss(arr,k);
		                break;
		      case 2: fb.findMinNumAtPoss(arr,k);
		         break;
		      default : System.out.println("invailid choice");
		      
	              }
	      
        }

}
