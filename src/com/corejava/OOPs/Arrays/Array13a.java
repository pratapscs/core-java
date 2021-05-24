package com.corejava.OOPs.Arrays;

/*13.what are the exceptions associated with arrays?
 *  java.lang.ArrayIndexOutOfBoundsException
 *  
 */
public class Array13a
{
	public static void main(String[] args)
	{
        char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
        System.out.println(matrix);

        /* Print each letter of the char array in a separate line. */
        for(int i = 0; i <= matrix.length; ++i) {
        	
       /* we ask the matrix[5] element. However, this element does not exist, 
        * as our matrix has size 5 and thus, a valid index resides in the interval 
        * [0, 4].
      	*/
             System.out.println(matrix[i]); 
        }
   }

}
