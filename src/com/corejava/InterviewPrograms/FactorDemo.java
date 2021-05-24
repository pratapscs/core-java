package com.corejava.InterviewPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorDemo {
//
//	public static void main(String[] args) {
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("Factors of a number"+i+" are ");
//			
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)
//				{
//					System.out.println(" "+j);
//				}
//			}
//		}
//	}
	
	
	
	public static void main(String[] args) {
		
	       Scanner s = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int n = s.nextInt();
	       String fact = factorial(n);
	       System.out.println("Factorial is " + fact);
	   }

	   public static String factorial(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }
}