package com.corejava.InterviewPrograms;

//Java program to add two number without using addition operator
	
import java.util.Scanner;

	public class Addition
	{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	int a, b;
	int sum;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any two integers: ");
	a = sc.nextInt();
	b = sc.nextInt();
	
	sum = a - ~b - 1;
	
	System.out.print("Sum of two integers: " + sum);
	}
	}

