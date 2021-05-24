package com.corejava.OOPs.MethodOverriding;

/*
 * superclass - Animal
 */
class Animals 
{
    void food() {
           System.out.println("Animal may eat flesh, grass or ....");
    }
}
 
/*
 * subclass of Animal - Lion
 */
class Lion extends Animals {
    @Override
    void food() {
           System.out.println("Lion eat - flesh");
    }
}
 
 
/*
 * subclass of Animal - Goat
 */
class Goat extends Animals {
    
	@Override
    void food() 
    {
           System.out.println("Goat eat - grass");
    }
}
 
 
/**
 * Main class
 */
public class MyClass1 
{
    public static void main(String[] args) 
    {
           Animals lion = new Lion();
           lion.food();
 
           Animals goat = new Goat();
           goat.food();
    }
}