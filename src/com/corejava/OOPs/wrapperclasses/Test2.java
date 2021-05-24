package com.corejava.OOPs.wrapperclasses;

public class Test2 {

	public static void main(String[] args) {
		
        for (int i = 0; i < 2; i++) {
               //code..
        	
        	System.out.println("i= " + i);
        }
        
        /* Java compiler will convert above code into -
         * No conversions will be made by compiler
         * No boxing or unboxing is done.
         * No objects will be formed.
         * Performance will be very good.
         */
 }
}
