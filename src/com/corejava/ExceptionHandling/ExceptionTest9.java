package com.corejava.ExceptionHandling;

public class ExceptionTest9 
{
	public static void main(String[] args) {
        System.out.println("method return -> "+m());
 }
 
 @SuppressWarnings({ "finally", "unused" })
static String m(){
        try{
               int i=1;
               return "try";
        }finally{
               return "finally";              
        }
        
 }

}
