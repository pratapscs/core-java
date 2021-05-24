package com.corejava.OOPs.CallByValueCallByReference;

public class PassByValueExample1 
{
    public static void main(String[] args) 
    {
           
           int i=1;  //primitive type
           String str = "a"; //String object
           
           System.out.println("In main(), BEFORE passing by value i.e. BEFORE calling method m()");
           System.out.println("i = "+i+", str = "+str);
           
           m(i, str); //PASS int primitive type and String object by VALUE
           
           System.out.println("\nIn main(), AFTER passing by value i.e. AFTER calling method m()");
           System.out.println("i = "+i+", str = "+str);
           
    }
 
    static void m(int i, String str)
    {
           i = 2;
           str = "b";
           System.out.println("\nIn method m(), after making changes to parameters");
           System.out.println("i = "+i+", str = "+str);
           
    }
}
 
