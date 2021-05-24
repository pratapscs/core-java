package com.corejava.OOPs.Varargs;

/* Varargs must always be the last argument in the method. Any attempt to add 
 * argument after varargs will generate compilation error in java.
 * 
 * 
 * static void myMethod(String... str, int i){} //compilation error
 * static void myMethod(int i, String... str){} //Valid
 * 
 * static void myMethod(String... str, String i){} //compilation error
 * static void myMethod(String i, String... str){} //Valid
 * 
 * static void myMethod(int... i1, int i){} //compilation error
 * static void myMethod(int i, int... i1){} //Valid
 * 
 * static void myMethod(String s, int... i1, int i){} //compilation error
 * static void myMethod(String s, int i, int... i1){} //Valid
 * 
 * static void myMethod(int... i1, String s, int i){} //compilation error
 * static void myMethod(String s, int i, int... i1){} //Valid
 * 
 * static void myMethod(int... i1, String s, int i){} //compilation error
 * static void myMethod(String s, int i, int... i1){} //Valid

 */
public class VarargsExample4 
{
	 static void myMethod(int i1, int i2, String... str){
	    }
	    
	    public static void main(String[] args) {
	           myMethod(1, 2,       //int argument
	                        "a","b");  //Varargs argument
	    }

}
