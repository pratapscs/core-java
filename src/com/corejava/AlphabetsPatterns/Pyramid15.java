package com.corejava.AlphabetsPatterns;

import java.util.Scanner;

public class Pyramid15 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) {
           
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter n : ");  
           int n = scanner.nextInt();
           System.out.println("");
 
 
           for (int i = 1; i <= n; i++)
           {
                  for (int j = 1, k=i ; j <= i; j++)
                  {
                        System.out.print(k * j+" ");
                  }
                  System.out.println("");
           }
 
    }
}