package com.corejava.RefelctionAPI;

/* It returns the instance of Class class. It should be used if you know the type. 
 * Moreover, it can be used with primitives.
 * 
 */
class Simple2{}  

class Test2
{  
  @SuppressWarnings("rawtypes")
  void printName(Object obj)
  {  
  Class c=obj.getClass();    
  System.out.println(c.getName());  
  }  
  public static void main(String args[])
  {  
   Simple2 s=new Simple2();  
   
   Test2 t=new Test2();  
   t.printName(s);  
 }  
}  