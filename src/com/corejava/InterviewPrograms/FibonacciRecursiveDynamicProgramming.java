package com.corejava.InterviewPrograms;

public class FibonacciRecursiveDynamicProgramming {

	private static int Fibo(int[] F,int n)
	{
		if(F[n]<0)
		{
			if(n==1|| n==2)
				F[n] = 1;
			else
				return F[n] = Fibo(F,n-1)+Fibo(F,n-2);
		}
		return F[n];
	}
	public static void main(String[] args)	
	{
		int F[] = new int[50];
		for(int i=0 ; i< 50 ;i++)
			F[i] = -i;
		System.out.println(Fibo(F,7));
		
	}
}
