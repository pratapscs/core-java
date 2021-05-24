package com.corejava.Basics.ArgumentsvsParameters;

/* argument : argument used in method call.
 * 
 * parameter  : parameter is used in method definition.
 * 
 */

public class ParameterArgumentTest 
{
    public static void main(String[] args)
    {
           int a=3, b=4;
           sum(a,b); //a & b are arguments here
    }
 
    static void sum(int a, int b){ //a & b are parameters here
           System.out.println("sum = "+ (a+b));
    }
}
 