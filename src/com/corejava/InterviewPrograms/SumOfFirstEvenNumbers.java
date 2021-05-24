package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class SumOfFirstEvenNumbers  {

	public static int sumOfEvenNumbersUpto(int number) {
		int sum = 0;
		for(int i=2;i<=number;i = i + 2){
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value :");
		int number=scanner.nextInt();
		
		System.out.println("SumOfFirstEvenNumbers : "+sumOfEvenNumbersUpto(number));
	}

}