package com.corejava.String;

/*11.where are immutable strings required in java?
 * 
 * string pool
 */
public class String11 
{
	public static void main(String[] args) {
		
		String s1 = "abc";
		//No string with “abc” is there in pool, so JVM will create string in string 
		//pool and s1 will be a reference variable which will refer to it.
		
      	String s2 = new String("abc");
      	//string is created using new operator, it will force JVM to create new string 
      	//in heap (not in string pool).
      	
      	String s3 = "abc";
      	//string with “abc” is there in pool, so s3 will be a reference variable 
      	//which will refer to “abc” in string pool.
      	
      	String s4 = new String("abc");
      	//string is created using new operator, it will force JVM to create 
      	//new string in heap (not in string pool).

      	String s5 = new String("abc").intern();
      	//string is created using new operator but intern method has been invoked on 
      	//it, so s5 will be a reference variable which will refer to “abc” in string pool.

      	System.out.println("--comparing s1--");
      	System.out.println(s1==s2); //false
      	System.out.println(s1==s3); //true
      	System.out.println(s1==s4); //false
      	System.out.println(s1==s5); //true

      	System.out.println("--comparing s2--"); 
      	System.out.println(s2==s3); //false
      	System.out.println(s2==s4); //false
      	System.out.println(s2==s5); //false
      	

      	System.out.println("--comparing s3--");
      	System.out.println(s3==s4); //false
      	System.out.println(s3==s5); //true
      	

      	System.out.println("--comparing s4--");
      	System.out.println(s4==s5); //false
      	
	}

}
