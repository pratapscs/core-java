package com.corejava.String;
/*84.Is StringBuffer class thread safe?
 * yes
 * 
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot 
 * access it simultaneously. So it is safe and will result in an order.
 * 
 * But being thread safe has disadvantages too as the performance 
 * of the StringBuffer hits due to thread safe property .
 * 
 * StringBuilder is faster than the StringBuffer when calling the same 
 * methods of each class.
 */
public class String84 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		StringBuffer demo1 = new StringBuffer("Hello") ;
		// The above object stored in heap and its value can be changed .
		demo1=new StringBuffer("Bye");
		// Above statement is right as it modifies the value which is allowed 
		//in the StringBuffer
		
	}

}
