package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class FactorialExample
{
	 @SuppressWarnings("resource")
	public static void main(String...args)
	 { 
         System.out.println("Enter no :");
         
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         
         System.out.println("Factorial of "+num+" is: "+findFactorail(num));     
  }
  
  /*
   * return factorial of num.
   */
  public static int findFactorail(int num)
  {
         int factorial=1;
         
         while(num>0)
         {
                factorial=factorial*num;
                num--;
         }
         return factorial;
  }

}
