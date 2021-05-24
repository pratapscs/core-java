package com.corejava.String;

/*12.what is a String pool in java?
 * 
 * String objects are stored in a special memory area known as string constant pool.
 * (or) String literal pool (or) String intern pool.
 *
 * Firstly JVM will not find any string object with the value "Welcome" in string
 * constant pool, so it will create a new object. After that it will find the 
 * string with the value "Welcome" in the pool, it will not create new object 
 * but will return the reference to the same instance.
 * 
 * Why String pool in java?
 * Strings are widely used in java code. And they are immutable which allows them to 
 * be cached in memory to save memory and increase performance. less number number 
 * of strings are created in java heap and hence leaving less work for garbage collector 
 * to be done.
 * 
 */
public class String20
{
	public static void main(String[] args) {
		
		String s1="Welcome";  
		String s2="Welcome";//will not create new instance  
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
