package com.corejava.OOPs.Inheritance;

interface Animal3 {}

class TerrestrialAnimal1 implements Animal3{}
class AquaticAnimal2 implements Animal3{}
 
class Lion1 extends TerrestrialAnimal1 {}
class Goat1 extends TerrestrialAnimal1 {}
 
class Fish1 extends AquaticAnimal2 {}
class Whale1 extends AquaticAnimal2 {}
 
 
public class MyClass3
{
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
           Object aa1 = new AquaticAnimal2(); //AquaticAnimal IS-A Object
           Animal3 aa2 = new AquaticAnimal2(); //AquaticAnimal IS-A Animal
           
 
           Object f1 = new Fish1(); //Fish IS-A Object
           Animal3 f2 = new Fish1(); //Fish IS-A Animal
           AquaticAnimal2 f3 = new Fish1(); //Fish IS-A AquaticAnimal
 
    }
}