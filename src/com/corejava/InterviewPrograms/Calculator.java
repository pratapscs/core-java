package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		  float a, b, result;
	      char choice, ch;
	        
	      Scanner scan = new Scanner(System.in);
			
	        do
	        {
	            System.out.print("1. Addition\n");
	            System.out.print("2. Subtraction\n");
	            System.out.print("3. Multiplication\n");
	            System.out.print("4. Division\n");
	            System.out.print("5. Exit\n\n");
	            System.out.print("Enter Your Choice : ");
	            
	            choice = scan.next().charAt(0);
	            
	            switch(choice)
	            {
	                case '1' : System.out.print("Enter Two Number : ");
	                    a = scan.nextFloat();
	                    b = scan.nextFloat();
	                    result = a + b;
	                    System.out.print("Result = " + result);
	                    break;
	                case '2' : System.out.print("Enter Two Number : ");
	                    a = scan.nextFloat();
	                    b = scan.nextFloat();
	                    result = a - b;
	                    System.out.print("Result = " + result);
	                    break;
	                case '3' : System.out.print("Enter Two Number : ");
	                    a = scan.nextFloat();
	                    b = scan.nextFloat();
	                    result = a * b;
	                    System.out.print("Result = " + result);
	                    break;
	                case '4' : System.out.print("Enter Two Number : ");
	                    a = scan.nextFloat();
	                    b = scan.nextFloat();
	                    result = a / b;
	                    System.out.print("Result = " + result);
	                    break;
	                case '5' : System.exit(0);
	                    break;
	                default : System.out.print("Wrong Choice!!!");
	                    break;
	            }
	            System.out.print("\n---------------------------------------\n");
	        }while(choice != 5);       
	   
	}
}
