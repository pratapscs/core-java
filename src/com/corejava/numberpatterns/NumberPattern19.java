package com.corejava.numberpatterns;

import java.util.Scanner;

/*
 *       1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 */
public class NumberPattern19 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = sc.nextInt();
 
        //Initializing rowCount with 1
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'j' value at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }

}
