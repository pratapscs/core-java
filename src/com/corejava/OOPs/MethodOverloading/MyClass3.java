package com.corejava.OOPs.MethodOverloading;

class SuperClass{
    public void sum(int x, int y) {
           System.out.println("sum of 2 int type arguments = "+ (x+y));
    }
}
 
class SubClass extends SuperClass{
    public void sum(double x, double y) {
           System.out.println("sum of 2 double type arguments = "+ (x+y));
    }
}
 
public class MyClass3 {
 
    public static void main(String[] args) {
           SubClass obj = new SubClass();
           obj.sum(2, 1);
           obj.sum(2.1, 3.4);
    }
 
}
 