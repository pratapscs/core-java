package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class EvenOrOddWithOutUsingModulo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int number=scanner.nextInt();
		
		int result = (number/2)*2;
	
		if(result == number)
		{
			System.out.println("given no is even");
		}
		else {
			System.out.println("given no is odd");
		}
	}
}
