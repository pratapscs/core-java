package com.corejava.Basics.Operators;

public class BitWiseOperatorTest {
    public static void main(String[] args) {
           
           int x=38; //0010 0110
           int y=58; //0011 1010
 
           System.out.println(x+" - "+Integer.toBinaryString(x));
           System.out.println(y+" - "+Integer.toBinaryString(y));
 
           int z=x&y;
           System.out.println("\n & operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));
 
           z=x^y;
           System.out.println("\n ^ operator");
           System.out.println(z+" -  "+Integer.toBinaryString(z));
 
           z=x|y;
           System.out.println("\n | operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));
           
           
    }
 
}