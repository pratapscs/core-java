package com.corejava.InterviewPrograms;

import java.util.Scanner;

/* 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 * 1.Number is keep on incrementing
 * 2.two for loops(1st is no of rows,
 *   2nd for printing the values in each rows)
 */
public class FloydsTriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int n,c,d,num=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows:");
		n=sc.nextInt();//it will convet to string nto integer
		
		System.out.println("FloydsTriangle");
		
		for(c=1;c<=n;c++) //this for no of rows 
		{
			for(d=1;d<=c;d++) //this is for print the values 
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
	}
}
