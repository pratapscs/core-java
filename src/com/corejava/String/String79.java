package com.corejava.String;
/*79.where does the string pool exist?
 * 
 * permanent area 
 * 
 * String Pool in java is a pool of Strings stored in Java Heap Memory. 
 * 
 *                                  			      javaheap
 *                                     
 *      String s1="Cat";,String s2="Cat"; ------------  "Cat"
 *                                                      "Dog"
 *                                                      
 *                                                   String Pool
 *                                                                                                            
 */
public class String79 
{
	public static void main(String[] args)
	{
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
    }

}
