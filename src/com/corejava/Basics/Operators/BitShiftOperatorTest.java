package com.corejava.Basics.Operators;

public class BitShiftOperatorTest
{
    public static void main(String[] args) 
    {
           //128,64,32,16,   8,4,2,1
           int x=38; //0010 0110
 
           System.out.println(x+" - "+Integer.toBinaryString(x));
 
           int z=x>>2;
           System.out.println("\n >> operator");
           System.out.println(z+" -  "+Integer.toBinaryString(z));
 
           z=x<<2;
           System.out.println("\n << operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));
 
           x=38;
           z=x>>>2;
           System.out.println("\n >>> operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));
           
           
    }
 
}