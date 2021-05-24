package com.corejava.OOPs.Interfaces;

/*
 * abstract class
 */
abstract class TerrestrialAnimals 
{ 
    void habitat()    //instance method-[because all Terrestrial animals live on land]
    {   
           System.out.println("Habitat of Terrestrial animal is land");
    }   
    abstract void food();  //abstract method - [because food of all Terrestrial animals might be different]
    
}
 
/*
 * concrete class - Lion1
 */
class Lion1 extends TerrestrialAnimals
{
 
    @Override
    void food(){
           System.out.println("Lion eat - flesh");
    }
}
 
/*
 * concrete class - Lion1
 */
class Goat extends TerrestrialAnimals {
 
    @Override
    void food(){
           System.out.println("Goat eat - grass");
    }
}
 
public class MyClass7
{
    public static void main(String[] args)
    {
           TerrestrialAnimals lion=new Lion1();
           lion.habitat();
           lion.food();
 
           System.out.println();
           
           TerrestrialAnimals goat=new Goat();
           goat.habitat();
           goat.food();
    }
}