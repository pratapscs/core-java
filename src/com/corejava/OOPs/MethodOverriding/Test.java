package com.corejava.OOPs.MethodOverriding;

class Base {
   int i=1;
    void method() {
        System.out.println("in base");
    }
}

class Sub extends Base {
    int i = 2;

    void method() {

        System.out.println("in sub"+ i);
    }
}

public class Test { 
    public static void main(String[] args) {
        Base obj = new Sub(); // 1
        Sub obj1 = new Sub();
        obj.method();
        System.out.println(obj.i); //instance variable are never affected by polymorphism.
        
        System.out.println(obj1.i);//2
    }
}