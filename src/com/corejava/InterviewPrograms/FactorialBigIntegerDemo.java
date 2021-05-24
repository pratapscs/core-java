package com.corejava.InterviewPrograms;

import java.math.BigInteger;

public class FactorialBigIntegerDemo {

	public static void main(String[] args) {
		
	//	int number=10; //this works fine but go for 20 i will give unpredectible results
	
		int number=20; //-2102132736 ,why because beyond the range of integer,integer overflow will happen very big integers
		
	//	int fact=1;   // instead of int take BigInteger
		
		BigInteger fact=BigInteger.ONE; 
		
		for(int i=1;i<=number;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
