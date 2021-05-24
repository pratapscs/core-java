package com.corejava.RefelctionAPI;

import java.lang.reflect.Method;

class ReflectionClass {
 
    /**
     * constructor
     */
    public ReflectionClass() {
           System.out.println("in constructor of ReflectionClass");
    }
 
    /**
     * Method with no parameter
     */
    public void methodNoPara() {
           System.out.println("in methodNoPara() of ReflectionClass ");
    }
 
}
  
/**
 * Main class
 */
public class ReflectionTest 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String... a) 
    {
           try {
 
                  // step 1, load 'ReflectionClass' at runtime
                  Class cls = Class.forName("com.corejava.RefelctionAPI.ReflectionClass");
 
                  // step 2 //will call constructor of ReflectionClass
                  Object object = cls.newInstance();
                  
                  /* newInstance() method of Class class and Constructor class is 
                   * used to create a new instance of the class.
                   */
                  
                  
                  // step 3, calling methodNoPara()
                  Method method = cls.getMethod("methodNoPara", null);
                  method.invoke(object,null);
 
 
           } catch (Exception e) {
                  e.printStackTrace();
           }
 
    }
 
}