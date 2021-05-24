package com.corejava.String;

/*1.what is a String?
 * In java, string is basically an object that represents sequence of char values. 
 * An array of characters works same as java string. 
 */
public class String1 
{
	public static void main(String[] args) {
//		char[] ch={'p','r','a','t','a','p'};  
//		String s=new String(ch); 
//		System.out.println(s);
		
		
		//String str="ab";
		//No string with “ab” is there in string pool, so JVM will create string “ab” 
		//in string pool and str will be a reference variable which will refer to it.
		
      //  System.out.println(str.concat("cd")); //abcd
        //cd will be concatenated with ab and new string  “abcd”  will be formed. 
        //No string with “abcd” is there in pool, so JVM will create string “abcd” 
        //in string pool, but there won’t be any reference variable to “abcd”  
        //(we are using it only in system.out.println statement), meanwhile str will 
        //still be pointing to “ab”.
        
       // System.out.println(str); //ab
        //str is referring to  “ab” and string “abcd” will be eligible for garbage collection.
        
		String str="abcd";
		//No string with “ab” is there in string pool, so JVM will create string 
		//“ab” in string pool and str will be a reference variable which will refer to it.

       str="abcd";
        //No string with “abcd” is there in string pool, so JVM will create new 
        //string “abcd” in string pool and str will be a reference variable which 
        //will refer to it.
        
        //Now, String "ab" will stay in string pool but reference to it will be lost, 
        //and it will be eligible for garbage collection.
        
        System.out.println(str); //abcd
        
        /* Advantages of String being immutable >
         * HashCode of string is cached - JVM caches the hashCode of very frequently 
         * used String in application. JVM need not to calculate hashcode again.
         * Hence, performance of application is improved significantly.
         *  
         *  Avoiding Security threats - String is used as parameter in many important 
         *  java classes like network connection and file IO. If String wouldn't have 
         *  been immutable, it would have posed serious security threat to application 
         *  because any change made at one place could have also changed String passed 
         *  in these classes as well (changes may have been done intentionally, may be 
         *  for hacking purposes).
         */
   
        //how to print ASCII Values ?
        String str1="pratap";
        
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
        	char character = str1.charAt(i); // start on the first character
            int ascii = (int) character; //convert the first character
            System.out.println(character+" = "+ ascii); // print the character and it's value in ascii
            
            count=count+ascii;
        }
        
        System.out.println(count);
        
	}

	   
}
