package com.corejava.OOPs.Varargs;

public class VarargsExample2
{
	 
    static void myMethod(String... str){
    }
    
    public static void main(String[] args) {
           myMethod("a");
         //  myMethod("a","b"); - 2 argument 
         //  myMethod("a","b","c","d","e");  - 5 argument 
    }
}