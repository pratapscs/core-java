package com.corejava.InterviewPrograms;

/* how to find missing no in array?
 * 
 * 1.Initialize one integer array
 * 2.need to know actual array size
 * 3.calculate expected total with n(n+1)/2 formula
 * 4.calculate actual total by adding each element in the array.
 * 5.deduct expected and actual which will give you missing number in array.
 * 
 */
public class MissingNumberDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int [] array={1,2,3,4,6};
		int missingNumber = getMissingNumber(array,6);
	}

	@SuppressWarnings("unused")
	private static int getMissingNumber(int[] array, int n) {
		
		int expectedSum=(n*(n+1)/2);
		
		return 0;
	}
	
	
}
