package com.corejava.OOPs.Inheritance;

class Animal2 {}

class TerrestrialAnimal extends Animal2{}
class AquaticAnimal1 extends Animal2{}
 
class Lion2 extends TerrestrialAnimal {}
class Goat extends TerrestrialAnimal {}
 
class Fish extends AquaticAnimal1 {}
class Whale extends AquaticAnimal1 {}
 
 
public class MyClass2
{
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
           Object a = new Animal2();  //Animal IS-A Object
 

           Object aa1 = new AquaticAnimal1(); //AquaticAnimal IS-A Object
           Animal2 aa2 = new AquaticAnimal1(); //AquaticAnimal IS-A Animal
           
 
           Object f1 = new Fish(); //Fish IS-A Object
           Animal2 f2 = new Fish(); //Fish IS-A Animal
           AquaticAnimal1 f3 = new Fish(); //Fish IS-A AquaticAnimal
 
    }
}