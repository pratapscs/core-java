package com.corejava.Java7features;

public class BinaryLiterals {
	 
	 public static void main(String[] args) {
	   
	  // Before Java 7
	  // In order to use Binary Numbers as Integral types
	  // Integer class static method parseInt was used. 
	  // This method Parses the string argument as a signed 
	  // integer in the radix specified by the second argument.
	  int number = Integer.parseInt("1011", 2);
	   
	  System.out.println("The value of number is : " + number);
	   
	  // After Java 7
	  // Binary Literals were introduced which were represented by
	  // prefix such as 0b and 0B. The prefix denoted that number
	  // coming after that is binary number
	  int number2 = 0b1011;  // 0b or 0B
	   
	  System.out.println("The value of number2 is : " + number2);
	   
	 }
	 
	}