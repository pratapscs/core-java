package com.corejava.OOPs.MethodOverriding;

class SuperClass
{
    public SuperClass myMethod() {
           return new SuperClass();
    }
}
 
class SubClass extends SuperClass{
    @Override
    public SuperClass myMethod() {
           return new SubClass();
    }
}