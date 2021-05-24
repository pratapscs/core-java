package com.corejava.InterviewPrograms;

//How to call private method from another class in java?

import java.lang.reflect.Method;

class Test
{
    @SuppressWarnings("unused")
	private void call(int n)  //private method
    {
        System.out.println("in call()  n: "+ n);
    }
}
public class Interview3
{
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) throws Exception
    {
        Class c=Class.forName("Test");  //specify class name in quotes
        Object obj=c.newInstance();

        //----Accessing private Method
        Method m=c.getDeclaredMethod("call",new Class[]{int.class}); //getting method with parameters
        m.setAccessible(true);
        m.invoke(obj,7);
    }
}