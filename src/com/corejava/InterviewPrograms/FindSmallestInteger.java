package com.corejava.InterviewPrograms;

public class FindSmallestInteger
{
	/*
	 * Smallest of three integers without comparison operators?
	 * 
	 * Take a counter variable c and initialize it with 0. In a loop, repeatedly subtract x, y and z by 1 and increment c. The number which becomes 0 first is the smallest. After the loop terminates, c will hold the minimum of 3.

#include<stdio.h>
 
int smallest(int x, int y, int z)
{
  int c = 0;
  while ( x && y && z )
  {
      x--;  y--; z--; c++;
  }
  return c;
}
 
int main()
{
   int x = 12, y = 15, z = 5;
   printf("Minimum of 3 numbers is %d", smallest(x, y, z));
   return 0;
}
	 */

}
