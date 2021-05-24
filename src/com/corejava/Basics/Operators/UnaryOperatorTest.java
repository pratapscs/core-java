package com.corejava.Basics.Operators;

public class UnaryOperatorTest 
{
    public static void main(String[] args) {
 
           int result=+1;
           System.out.println("+   "+ result); //1
 
           result=-1;
           System.out.println("-  "+ result); //-1
 
           
           result=3;
           System.out.println("--------Now, result="+result);
           result++;
           System.out.println("++  "+ result); //4
 
           result--;
           System.out.println("--  "+ result); //3
 
           boolean boo=true;
           System.out.println("!   "+ !boo); //false
           
    }
 
}