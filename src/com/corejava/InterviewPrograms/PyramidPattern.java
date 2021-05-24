package com.corejava.InterviewPrograms;

/* 12345  5    1 to 5
 * 1234   4    1 to 4
 * 123    3    1 to 3
 * 12     2    1 to 2
 * 1      1    1 to 1
 */
public class PyramidPattern {

	public static void main(String[] args) {
		
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++){
				
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
}
