package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class AlphabetChecking {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter Charater:");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		
		if((ch >='a' && ch<='z') || (ch >='A' && ch<='Z')){
			
			System.out.println("the given character is alphabet");
			
		}else
		{
			System.out.println("the given character is not alphabet");
		}
	}
}
