package com.corejava.OOPs.Interfaces;

/*
 * interface
 */
interface Animals 
{
    abstract void habitat();   //abstract method -  [because animals might be living on land or water]
    abstract void food();      //abstract method-  [because food of all animals might be different]
}
/*
 * concrete class - Lion
 */
class Lion implements Animals 
{ 
    @Override
    public void habitat()
    {
           System.out.println("Habitat of Lion is land");
    }
    
    @Override
    public void food()
    {
           System.out.println("Lion eat - flesh");
    }
}
/*
 * concrete class - Lion
 */
class Whale implements Animals 
{ 
    @Override
    public void habitat(){
           System.out.println("Habitat of Whale is water");
    }
    
    @Override
    public void food(){
           System.out.println("Whale eat - aquatic animals");
    }
}
 
public class MyClass6
{
    public static void main(String[] args)
    {
           Animals lion=new Lion();
           lion.habitat();
           lion.food();
           
           System.out.println();
           
           Animals whale=new Whale();
           whale.habitat();
           whale.food();
    }
}