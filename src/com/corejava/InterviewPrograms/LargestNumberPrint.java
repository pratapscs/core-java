package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class LargestNumberPrint {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("enter three distinct integers");
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y && x>y){
			System.out.println(x + " is largest");
		}
		else if(y>z && y>x){
			System.out.println(y + " is largest");
		}else if(z>x && z>y){
			System.out.println(z + " is largest");
		}
		
	}
}
