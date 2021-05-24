package com.corejava.OOPs.wrapperclasses;

import java.util.GregorianCalendar;

public class Test4 {

	public static void main(String[] args) {
		
        GregorianCalendar cal1 = new GregorianCalendar();                 
        
//        for (int i = 0; i < 2147483647; i++) {
//               // code..
//        }
        
        for (Integer i = 0; i < 2147483647; i++) {
            // code..
          }
        
        GregorianCalendar cal2 = new GregorianCalendar();  
        
        long diffIn_MilliSec = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
        
        System.out.println("for loop with int completed in "+ diffIn_MilliSec+" milliSeconds");
 }
	
	/* unnecessary Integer objects formation in heap
	 * Frequent execution of garbage collection processes.
	 * unnecessary autoboxing/ unboxing operations.
	 */
}
