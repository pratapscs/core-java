package com.corejava.String;

/*33.can we directly print objects?
 *
 * no
 *  
 */
public class String33 
{
	public static void main(String[] args) 
	{
		int array[]=new int[2];
		array[0]=10;
		System.out.println(array[0]); //it works
		Object obj=new Object();
		System.out.println(obj); //it shows the classname and some value i don't know
	}

}
