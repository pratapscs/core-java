package com.corejava.OOPs.TypeCasting;



public class ConvertStringToInt {

	public static void main(String[] args) {
		
		String number = "10";
	   
		//In Java, you can use Integer.parseInt() to convert a String to int.
		//int result = Integer.parseInt(number);
		
		//Alternatively, you can use Integer.valueOf(), it will returns an Integer object
		Integer result = Integer.valueOf(number);
		
		System.out.println(result);
		
		//parseInt(String) returns a primitive int, whereas valueOf(String) returns 
		//a new Integer() object.
		
		//string does not contain a parsable integer, a NumberFormatException 
		//will be thrown.
		
		String number1 = "10A";
		int result1 = Integer.parseInt(number1);
		System.out.println(result1);
	}
}
