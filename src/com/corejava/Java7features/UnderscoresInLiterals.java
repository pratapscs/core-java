package com.corejava.Java7features;

public class UnderscoresInLiterals {
	 
	 public static void main(String[] args) {
	 
	  // Credit Card and Debit Card numbers 
	  // not very clear to read.
	  // Poor code readability
	  long debitCard = 4657847382084234L;
	  long creditCard = 7657382844234084L;
	 
	  System.out.println("Lets print out credit card and debit card numbers : ");
	  System.out.println("Debit Card as String: " + Long.toString(debitCard));
	  System.out.println("Credit Card as String: " + Long.toString(creditCard));
	 
	  System.out.println();
	 
	  // Credit Card and Debit Card numbers 
	  // very clear to read.
	  // Better code readability
	  debitCard = 4657_8473_8208_4234L;
	  creditCard = 7657_3828_4423_4084L;
	 
	  // Result is same as above.
	  System.out.println("Lets print out credit card and debit card numbers : ");
	  System.out.println("Debit Card as String: " + Long.toString(debitCard));
	  System.out.println("Credit Card as String: " + Long.toString(creditCard));
	 
	 }
	 
	}