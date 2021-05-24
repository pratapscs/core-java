package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class FibonacciImplementation {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter no :");
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		
		int[] fib=new int[count];
		
		fib[0]= 0;
		fib[1]=1;
		
		for(int i=2;i<count;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		for(int i : fib)
		{
			System.out.println(i);
		}
	}	
}
