package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class SplitNumber
{
@SuppressWarnings("resource")
public static void main(String[] args)
{
	int num, temp, factor = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");

		num = sc.nextInt();
		temp = num;
		while (temp != 0) {
		temp = temp / 10;
		factor = factor * 10;
}
	System.out.print("Each digits of given number are: ");

	while (factor > 1) {
		factor = factor / 10;
		System.out.print((num / factor) + " ");
		num = num % factor;
}
}
}