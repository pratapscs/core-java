package com.corejava.InterviewPrograms;

import java.util.Scanner;

/* prime number is a natural number greater than 1 that has no positive 
 * divisors other than 1 and itself.
 * 
 */
public class PrimeNumber 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
        System.out.println("Enter no :");
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(isPrimeNumber(n)? n+" is prime number." : n+" is not prime number.");
      
 }
 
 /**
  * returns true if number is prime.
  */
 public static boolean isPrimeNumber(int n)
 {
               
        for(int i=2;i<n;i++)
        {
               if(n%i==0){
                     return false;
               }
        }
        return true;  //means number wasn't divisible by any of the number, it's a prime number.
 }

}
