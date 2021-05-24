package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class MultiplicationDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int n,i;
		
		System.out.println("Enter the no tp print multiplication table");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		
	}
}
