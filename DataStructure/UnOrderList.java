package com.datastructure;

import com.datastructure.DSUtility;

public class UnOrderList {
	
public static void main(String[] args) throws Exception{
		
		String path = "/home/admin123/papu.txt";
		
		//Reading the file and storing it in an array
		
		String string = Utility.readFile(path);
        System.out.println("Enter the word to search :");
        String searchWord = Utility.inputSingleString();
        
        //Calling unOrderedList of DSUtil class 
        
        DSUtility.unOrderedList(searchWord, string);
        
        //Closing Scanner
        
Utility.closeScanner();

}}
