package com.corejava.OOPs.statickeyword;

class Employee2 {
	 
    /*
     * Static block
     */
    static {
           System.out.println("static block");
    }
 
 
    /*
     * Non-Static block (Instance block)
     */
    {
           System.out.println("non-static block");
    }
 
    /*
     * Constructor
     */
    Employee2() {
           System.out.println("Employee constructor");
    }
 
}
 
public class StaticBlockTest 
{
    public static void main(String[] args) 
    {
           
           //Create instance of Employee.
           new Employee2();
           
    }
           
}