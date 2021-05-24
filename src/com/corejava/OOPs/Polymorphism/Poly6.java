package com.corejava.OOPs.Polymorphism;
/*
 * 6.can overloaded methods declere checked exceptions?
 *  yes
 *  
 *  Thrown exceptions from methods are also not considered when overloading a method.
 *  So your overloaded method throws the same exception, a different exception 
 *  or it simply does no throw any exception.
 *   
 *  no effect at all on method loading.
 */
public class Poly6 
{
    // Overloaded method
    public Integer sum(Integer a, Integer b) throws NullPointerException
    {
        return a + b;
    }
 
    // Overloading method
    /* public Integer sum(Integer a, Integer b) throws Exception
     * {  //Not valid; Compile time error
       return null;
        
    }*/
public static void main(String[] args) {
	
}
}