package com.corejava.OOPs.CovariantReturnType;

class SuperClass 
{
    public SuperClass myMethod()
    {
           System.out.println("In SuperClass myMethod()");
           return new SuperClass();
    }
}
 
class SubClass extends SuperClass
{
    @Override
    public SuperClass myMethod() {        //Method overriding
           System.out.println("In SubClass myMethod()");
           return new SubClass();         //Covariant Return Type
    }
}
 
public class CovariantReturnTypesExampleInJava 
{
    public static void main(String[] args) 
    {
           SuperClass obj = new SubClass(); //Create obj to access myMethod -> it will print subclass method
           
        //   SuperClass obj = new SuperClass(); //it will print only superclass method
 
           obj.myMethod(); //It will call myMethod, which will return Covariant Return Type
    }
}
 