package com.corejava.String;

/*17.Name some of the commenly used in build methods of String class?
 * 
 * Java String class provides a lot of methods to perform operations on string
 * such as compare(), concat(), equals(), split(), length(), replace(), 
 * compareTo(), intern(), substring() etc.
 * 
 */
public class String17 
{
	public static void main(String args[])
	{  
		//Java String toUpperCase() and toLowerCase() method
		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)  
		
		//Java String trim() method 
		System.out.println(s);//  Sachin    
		System.out.println(s.trim());//Sachin 
		
		//Java String startsWith() and endsWith() method
		System.out.println(s.startsWith("Sa"));//true  
		System.out.println(s.endsWith("n"));//true 
		
		//Java String charAt() method
		System.out.println(s.charAt(0));//S  
		System.out.println(s.charAt(3));//h  
		
		//Java String length() method
		System.out.println(s.length());//6  
		
		//Java String intern() method
		String s1=new String("Sachin");  
		String s2=s1.intern();  
		System.out.println(s2);//Sachin  
		
		//Java String valueOf() method
		int a=10;  
		String s3=String.valueOf(a);  
		System.out.println(s3+10);  
		
		//Java String replace() method
		String s4="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s4.replace("Java","mava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);   
		
		}

}
