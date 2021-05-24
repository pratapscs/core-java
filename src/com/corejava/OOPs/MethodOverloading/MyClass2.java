package com.corejava.OOPs.MethodOverloading;

public class MyClass2 {
	 
    /*
     * Method to calculate sum of 2 int type arguments
     */
    public void sum(int x, int y) {
           System.out.println("sum of 2 int type arguments = "+ (x+y));
    }
 
    /*
     * Method to calculate sum of 2 double type arguments
     */
    public void sum(double x, double y) {
           System.out.println("sum of 2 double type arguments = "+ (x+y));
    }
 
    public static void main(String[] args) 
    {
           MyClass2 obj = new MyClass2();
           obj.sum(2, 3); // will call method to calculate sum of 2 int type arguments
           obj.sum(1.2, 2.3); // will call method to calculate sum of 2 double type arguments
    }
 
}