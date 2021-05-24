package com.corejava.Basics.Operators;

public class AssignmentOperatorTest 
{
    public static void main(String[] args)
    {
           int x=4;
           int y=2;
 
           x += y;
           System.out.println("+=   "+ x); //6
 
           
           x=4; y=2;
           
           x -= y;
           System.out.println("-=   "+ x); //2
 
           
           x=4; y=2;
           
           x *= y;
           System.out.println("*=   "+ x); //8
 
           
           x=4; y=2;
           
           x /= y;
           System.out.println("/=   "+ x); //2
           
    }
 
}