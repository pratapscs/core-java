package com.corejava.OOPs.wrapperclasses;

public class Test3 {

	public static void main(String[] args) {
       
		for (Integer i = 0; i < 2; i++) {
               // code..
               System.out.println("i= " + i);
        }
		
		
/* for (Integer i = Integer.valueOf(0);   //Declaration
       
        i.intValue() < 2; //termination condition - termination_booleanVal -  i.intValue() < 2 (i.e. 0<2) evaluates to true. (one unnecessary unboxing operation will be performed)
        
        i= Integer.valueOf(i.intValue()+1)  ){ //increment
                  // code..
                  System.out.println("i= " + i);
           }
*
*
* 3 unnecessary Integer objects were formed in heap.
* For forming these 3 Integer objects 3 unnecessary autoboxing operations were performed.
* 5 unnecessary unboxing operations were performed.
*/
 }
}
