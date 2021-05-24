package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class SwappingArray
{
@SuppressWarnings("resource")
public static void main(String[] args)
{
	int[] a = new int[10], b = new int[10], c = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First array: ");

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
}
		System.out.println("Enter Second array: ");
		for (int i = 0; i < 10; i++) {
			b[i] = sc.nextInt();
}
		System.out.println("Arrays before swapping");
		System.out.println("First array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
}
		System.out.println("Second array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i]);
}
		for (int i = 0; i < 10; i++) { //write any swapping technique
			c[i] = a[i];
			a[i] = b[i];
			b[i] = c[i];
}
		System.out.println("Arrays after swapping");
		System.out.println("First array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
}
		System.out.println("Second array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i]);
}
}
}