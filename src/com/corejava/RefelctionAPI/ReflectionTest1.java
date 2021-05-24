package com.corejava.RefelctionAPI;

import java.lang.reflect.Method;

class ReflectionClass1 {
 
    /**
     * constructor
     */
    public ReflectionClass1() {
           System.out.println("in constructor of ReflectionClass");
    }
 
    /**
     * Method with no parameter
     */
    public void methodNoPara() {
           System.out.println("in methodNoPara() of ReflectionClass");
    }
 
 
    /**
     * Method with String parameter
     */
    public void methodString(String str) {
           System.out.println("in methodString()   > " + str);
    }
 
    /**
     * Method with Integer parameter
     */
    public void methodInteger(Integer integer) {
           System.out.println("in methodInteger()  > " + integer);
    }
 
 
}
 
/**
 * Main class
 */
public class ReflectionTest1 {
    @SuppressWarnings("rawtypes")
	public static void main(String... a) {
 
           try {
 
                  //String parameter
                  Class stringPara[] = new Class[1];
                  stringPara[0] = String.class;
 
                  Class integerPara[] = new Class[1];   
                  integerPara[0] = Integer.class;
                  
                  // step 1, load 'ReflectionClass' at runtime
                  Class<?> cls = Class.forName("com.corejava.RefelctionAPI.ReflectionClass1");
                  
                  // step 2 //will call constructor of ReflectionClass
                  Object object = cls.newInstance();
                  
                  // step 3a, calling methodNoPara()
                  Method method = cls.getMethod("methodNoPara", null);
                  method.invoke(object, null);
 
                  // step 3b, calling methodString()
                  method = cls.getMethod("methodString", stringPara);
                  method.invoke(object, "pratap");
 
                  // step 3c, calling methodInteger()
                  method = cls.getMethod("methodInteger", integerPara);
                  method.invoke(object, 541);
 
               
           } catch (Exception e) {
                  e.printStackTrace();
           }
 
    }
 
}