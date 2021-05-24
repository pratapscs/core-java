package com.corejava.OOPs.Arrays;

public class StringToCharArrayDemo {
	 
	 public static void main(String[] args) {
	 
	  // Create a String object with any value
	  String welcome = "Hello !!!. Welcome to pratap !!!.";
	 
	  // Print the String on the console
	  System.out.println("String used is : " + welcome);
	 
	  // In order to convert String to char array - 
	  // String class has a method by name as : toCharArray()
	  // This method returns back an array which holds characters
	  // of String.
	  char[] message = welcome.toCharArray();
	 
	  System.out.println("\nString converted to char array : ");
	 
	  // Looping over each character in message array created above.
	  // Printing each character one by one.
	  for(char character : message) {
	 
	   System.out.print(character);
	 
	  }
	 }
	}