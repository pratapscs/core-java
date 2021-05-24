package com.corejava.String;
/*67.what is the role of capacity()?
 * it returns the current capacity of buffer
 * 
 * capacity() method of StringBuffer/StringBuilder class returns the current 
 * capacity of the buffer. The default capacity of the buffer is 16. If the 
 * number of character increases from its current capacity, it increases the 
 * capacity by (oldcapacity*2)+2. For example if your current capacity is 16,
 * it will be(16*2)+2=34.
 * 
 */
public class String67 
{
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer();  //StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}  

}
