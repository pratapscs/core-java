package com.corejava.OOPs.Varargs;

/*
 * There can only be one Varargs in the method. Any attempt to add more than 
 * one varargs will generate compilation error in java.
 */
public class VarargsExample3 
{
	static void myMethod(int i, String... str)
    /* static void myMethod(int i, String... str){} //Valid
     * static void myMethod(int i, String... str, String... str2){} //compilation error
     * static void myMethod(String... str, String... str2){} //compilation error
     * static void myMethod(int... i, String... str){} //compilation error
     * static void myMethod(int i, int... i1){} //Valid
     */
	{
		
    }
     public static void main(String[] args) {
           myMethod(1,       //int argument
                        "a","b");  //Varargs argument
    }

}
