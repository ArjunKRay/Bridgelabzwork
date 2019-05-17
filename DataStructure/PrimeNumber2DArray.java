package com.datastructure;

import java.util.ArrayList;

public class PrimeNumber2DArray {
	public static void main(String[] args) {
		ArrayList primeList[]= new ArrayList[10];
		int i=0,temp=100;
		boolean cnt;
		
		
		/*Creating multiple objects of prime number list list and storing into a n array of list*/
		for(int j=0;j<10;j++)
		{
			primeList[j] = new ArrayList();
		}
		/*Checking Prime Numbers and storing into a list*/
		while(i<10)
		{
			for(int num=1;num<=1000;num++)
			{
				cnt = Utility.checkPrime(num);
				if(cnt==true)
					primeList[i].add(num);
				if(num==temp)
				{
					i++;
					temp=temp+100;
				}
					
			}	
		
		}
		for(ArrayList listItem : primeList)
			System.out.println(listItem);
		
}
}
