package com.corejava.InterviewPrograms;

//How to find the missing values from an sorted array.?

public class Interview5
{
	public static void main(String args[]) 
    {
        int[] a = {1, 3, 5, 6, 9, 50, 100};
        int prev = a[0];
        for (int i = 1; i < a.length; i++) 
        {
            int gap = a[i] - prev;
            
            if (gap - 1 == 1) {
                System.out.printf("Missing: %d\n", prev + 1);
            } else if (gap > 1) {
                System.out.printf("Missing: %d - %d\n", prev + 1, a[i] - 1);
            }
            prev = a[i];
        }
    }

}
