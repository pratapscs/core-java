package com.corejava.String;
/*68.what is the role of ensureCapacity?
 * it is used to ensure the minimum size of buffer
 * 
 * ensureCapacity() method of StringBuffer/StringBuilder class ensures that the given 
 * capacity is the minimum to the current capacity. If it is greater than the 
 * current capacity, it increases the capacity by (oldcapacity*2)+2. For example 
 * if your current capacity is 16, it will be (16*2)+2=34.
 * 
 */
public class String68
{
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer();   //StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  
		}  

}
