package com.corejava.OOPs.Arrays;

/*13.what are the exceptions associated with arrays?
 *  java.lang.IndexOutOfBoundsException
 *  
 *  The ArrayIndexOutOfBoundsException is a sub-class of the IndexOutOfBoundsException.
 */
import java.util.ArrayList;
import java.util.List;

class Array13b {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<Integer>();

     list.add(1);
     list.add(2);

     /* The following statement produces an IndexOutOfBoundsException. */
     System.out.println(list.get(2));
     
     /* An ArrayList with a size of 2 has valid indices in the interval [0, 1].
      * The exception is thrown because we requested for an invalid index. 
      * So, if we want to access the 2nd element of the list, we must write:
      * list.get(1);
      */
     }
}