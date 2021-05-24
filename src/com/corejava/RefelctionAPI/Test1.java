package com.corejava.RefelctionAPI;

/* is used to load the class dynamically.
 * returns the instance of Class class.
 * It should be used if you know the fully qualified name of class.
 * This cannot be used for primitive types.
 */
class Simple1{}  

class Test1
{  
 @SuppressWarnings("rawtypes")
public static void main(String args[]) throws ClassNotFoundException
 {  
  Class c= Class.forName("com.corejava.RefelctionAPI.Simple1");  
  System.out.println(c.getName());  
 }  
}  