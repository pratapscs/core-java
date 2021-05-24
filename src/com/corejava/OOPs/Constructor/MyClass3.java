package com.corejava.OOPs.Constructor;

class SuperClass4
{
    SuperClass4()
    {
          System.out.println("no-arg constructor of SuperClass");
    }
}
 
class SubClass4 extends SuperClass4
{
    SubClass4(){
           this(1);
           System.out.println("no-arg constructor of SubClass");
    }
    SubClass4(int i){
           super();
           System.out.println("int-arg constructor of SubClass");
    }
    
}
 public class MyClass3
{
    public static void main(String[] args) 
    {
        new SubClass4(); //will call constructor of SubClass
    }
}