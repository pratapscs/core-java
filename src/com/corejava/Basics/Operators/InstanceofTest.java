package com.corejava.Basics.Operators;

class SuperClass {}
class SubClass extends SuperClass{}
 
public class InstanceofTest 
{
    public static void main(String[] args)
    {
 
        SuperClass sup = new SuperClass();
        SuperClass sub = new SubClass();
 
        System.out.println("------------------SubClass instanceOf---");
       
        System.out.println("SuperClass instanceof SuperClass - "
         + (sup instanceof SuperClass));
        System.out.println("SuperClass instanceof SubClass - "
         + (sup instanceof SubClass));
        System.out.println("SuperClass instanceof java.lang.Object - "
         + (sup instanceof java.lang.Object));
 
        System.out.println("\n------------------SubClass instanceOf---");
       
        System.out.println("SubClass instanceof SuperClass - "
         + (sub instanceof SuperClass));
        System.out.println("SubClass instanceof SubClass - "
         + (sub instanceof SubClass));
        System.out.println("SubClass instanceof java.lang.Object - "
         + (sub instanceof java.lang.Object));
 
    }
}
 