package com.corejava.OOPs.Arrays;

public class TwoDimensionalArrayDemo
{
	  public static void main(String args[])
	  {
	     int twoDArray[][]= new int[5][5];
	     int i, j, k = 0;
	 
	     for(i=0; i<5; i++)
	       for(j=0; j<5; j++) {
	         twoDArray[i][j] = k;
	         k++;
	     }
	         
	     for(i=0; i<5; i++) {
	       for(j=0; j<5; j++)
	         System.out.print(twoDArray[i][j] + " ");
	         System.out.println();
	     }
	  }
	} 
