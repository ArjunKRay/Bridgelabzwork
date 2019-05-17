package com.datastructure;
public class Orderlist {
	

	public static void main(String[] args) throws Exception{
		String path ="/home/admin123/number.txt";

		//Reading the file and storing it in an array
		
		String string = Utility.readFile(path);
        System.out.println("Enter the number to search :");
        String number = Utility.inputSingleString();

        //Calling unOrderedList of DSUtil class 
        
        DSUtility.orderedList(number, string);
        
        //Closing Scaner
        
        Utility.closeScanner();
	}
}





