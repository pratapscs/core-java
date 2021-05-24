package com.corejava.InterviewPrograms;

/* 1.In this sorting technique elements are sorted in asc or desc 
 *   order by comparing to adjacent elements and place in them based on
 *   asc or desc order.
 *   
 * 2.if we have n elements then this sorting technique requires
 *   n-1 passes to sort
 *  
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int intArray[]={9,8,7,5,6};
		System.out.println("Before sorting");
		for(int i : intArray)
		{
			System.out.println(i);
		}
		
		bubbleSort(intArray);
		
		System.out.println("After sorting");
		for(int i : intArray)
		{
			System.out.println(i);
		}
	}
	
	private static void bubbleSort(int[] intArray)
	{
		int temp=0;//use for swapping the elements
		
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=1;j<(intArray.length)-i;j++)
			{
				if(intArray[j-1]>intArray[j]) // 9>8 ,9>7,9>5,9>6
				{
					//swap the elements
					temp = intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp; 
				}
			}
		}
	}
}

