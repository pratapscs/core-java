package com.corejava.InterviewPrograms;

//Java program to reverse a number.

import java.util.Scanner;

public class ReverseNumber
{
@SuppressWarnings("resource")
public static void main(String[] args)
{
	System.out.print("Enter any number: ");
	
	Scanner sc = new Scanner(System.in);
	int num, r, reverse = 0;
	
	num = sc.nextInt();
	
	while (num != 0)
	{
	r = num % 10;
	reverse = reverse * 10 + r;
	num = num / 10;
}
System.out.println("Reversed of number: " + reverse);
}

}