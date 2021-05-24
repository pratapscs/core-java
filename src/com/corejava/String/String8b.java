package com.corejava.String;

/*8.why are immutable strings required?
 */
public class String8b 
{
	private volatile int hashCode;
	//You keep a member field on the class, which represents the cached hashCode value

	   @Override 
	   public int hashCode()
	   {
	       int result = hashCode;
	       //if result == 0, the hashCode has not been computed yet, so compute it
	       if (result == 0)
	       {
	           result = 17;
	           int areaCode = 0;
			result = 31 * result + areaCode;
	           int prefix = 0;
			result = 31 * result + prefix;
	           int lineNumber = 0;
			result = 31 * result + lineNumber;
	           //remember the value you computed in the hashCode member field
	           hashCode = result;
	       }
	       // when you return result, you've either just come from the body of the above
	       // if statement, in which case you JUST calculated the value -- or -- you've
	       // skipped the if statement in which case you've calculated it in a prior
	       // invocation of hashCode, and you're returning the cached value.
	       return result;
	   }
	public static void main(String[] args) {
		
		//2. Caching Hashcode

	   /*The hashcode of the string is frequently used in Java. 
	    * For example, in a HashMap. Being immutable guarantees that hashcode 
	    * will always the same so that it can be cashed without worrying the changes.
	    * That means, there is no need to calculate hashcode every time it is used.
	    * This is more efficient.
     */
		
		String8b s=new String8b();
		s.hashCode();
		
//		String string ="pratap";
//		String s1="pratap";
//		System.out.println(string.hashCode());
//		System.out.println(s1.hashCode());
		
	}

}
