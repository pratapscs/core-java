package com.corejava.numberpatterns;

import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
 */
public class NumberPattern10 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }

}
