package com.corejava.InterviewPrograms;

/* Reverse String - keeping performance in mind (without StringBuffer) in java.
 * 
 * Method used to reverse String - reverseString()
 * 
 */
public class ReverseString 
{
	public static void main(String...args)
	{ 
        String originalString="abcde"; //String to be reversed
        
        System.out.println("Original String: "+originalString);
        System.out.println("Reversed String: "+reverseString(originalString));         
 }
 
	/*  String = a b c d e
     *           0 1 2 3 4
     *           
     * step 1: i=0 j=4 swap them a,e -> e b c d a
     * step 2: i=1 j=3 swap them b,d -> e d c b a
     *                                  0 1 2 3 4
     */
	
 public static String reverseString(String originalString)
 {
        char ar[]=originalString.toCharArray();
        char temp;
        for(int i=0,j=ar.length-1; i<(ar.length/2); i++,j--)
        {
               temp=ar[i];
               ar[i]=ar[j];
               ar[j]=temp;
        }
        return new String(ar);
 }

}
