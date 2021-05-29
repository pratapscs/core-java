package com.corejava.OOPs.Array;

/*18.are arrays are primitive datatypes?
 * 
 */
public class Array18
{
	public static void main(String[] args)
	{
	    test(int[].class);
	    test(String[].class);
	}

	@SuppressWarnings("rawtypes")
	static void test(Class clazz)
	{
	    System.out.println(clazz.getName());
	    System.out.println(clazz.getSuperclass());
	    for(Class face : clazz.getInterfaces())
	        System.out.println(face);
	}

}
