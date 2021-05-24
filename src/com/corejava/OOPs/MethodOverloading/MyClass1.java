package com.corejava.OOPs.MethodOverloading;

public class MyClass1 
{
	/*
     * Method to calculate sum of 2 arguments
     */
    public void sum(int x, int y) {
           System.out.println("sum of 2 arguments = "+ (x+y));
    }
 
    /*
     * Method to calculate sum of 3 arguments
     */
    public void sum(int x, int y, int z) {
           System.out.println("sum of 3 arguments = "+ (x+y+z));
    }
 
    public static void main(String[] args) 
    {
           MyClass1 obj = new MyClass1();
           obj.sum(2, 3); // will call method to calculate sum of 2 arguments
           obj.sum(2, 4, 3); // will call method to calculate sum of 3 arguments
    }
 

}
