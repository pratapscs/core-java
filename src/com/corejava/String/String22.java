package com.corejava.String;

/*22.why is string class considered immutable?
 *   
 *  Security: parameters are typically represented as String in network connections, database connection urls, usernames/passwords etc. If it were mutable, these parameters could be easily changed.
 *  Synchronization and concurrency: making String immutable automatically makes them thread safe thereby solving the synchronization issues.
 *  Caching: when compiler optimizes your String objects, it sees that if two objects have same value (a="test", and b="test") and thus you need only one string object (for both a and b, these two will point to the same object).
 *  Class loading: String is used as arguments for class loading. If mutable, it could result in wrong class being loaded (because mutable objects change their state).
 * 
 *   
 *  Why String pool in java?
 *  Strings are widely used in java code. And they are immutable which allows 
 *  them to be cached in memory to save memory and increase performance. 
 *  less number number of strings are created in java heap and hence leaving 
 *  less work for garbage collector to be done.
 *  
 *  
 */
public class String22 
{
	public static void main(String[] args) 
	{          
	           String s1 = "abc";
	           String s2 = new String("abc");
	           String s3 = "abc";
	           String s4 = new String("abc");
	           String s5 = new String("abc").intern();
	 
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
	
