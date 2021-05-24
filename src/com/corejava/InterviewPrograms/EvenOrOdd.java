package com.corejava.InterviewPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* when a number is divided by 2 and if we get remainder as 0 we say i is an even number 
 * 
 * when a number is divided by 2 and if we get remainder is not 0 we say i is an odd number 
 *
 * to get remainder we use modulo or percentaile operator
 */
public class EvenOrOdd 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number");
		
		Integer number = Integer.parseInt(br.readLine());
		
		if(number%2 == 0){
			System.out.println(number +" = is even ");
		}else 
		{
			System.out.println(number +" = is odd ");
		}
	}

}
