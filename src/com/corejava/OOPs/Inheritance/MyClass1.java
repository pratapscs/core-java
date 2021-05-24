package com.corejava.OOPs.Inheritance;

class Animal {
    void food() {
           System.out.println("Animal eat food");
    }
}
 
class Lion extends Animal {
    
}

public class MyClass1{
    public static void main(String[] args) {
           Lion obj = new Lion();
           obj.food();
    }
}