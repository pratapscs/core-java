package com.corejava.numberpatterns;

import java.util.Scanner;

/*       1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 * 
 */
public class NumberPattern18 
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
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }

}
