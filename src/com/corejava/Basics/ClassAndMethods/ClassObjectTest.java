package com.corejava.Basics.ClassAndMethods;

class Animals
{
	 
    public Animals() {} //constructor
    
    private String name; //instance variable/ member variable
    private String food;
 
    public String getName() { //method
           return name;
    }
    public void setName(String name) {
           this.name = name;
    }
    
    public String getFood() {
           return food;
    }
    public void setFood(String food) {
           this.food = food;
    }
 
}
 
 
public class ClassObjectTest
{
    public static void main(String[] args) 
    {

          // Animals animal1;  Declaration of referencer variable -> (animal1 -> null)
           
           Animals animal1 = new Animals();  // creating object
                                            // (animal1 -> name,food) - store in HEAP memory
           animal1.setName("lion");
           animal1.setFood("flesh");
 
           Animals animal2 = new Animals();
           animal2.setName("goat");
           animal2.setFood("grass");
 
           System.out.println("--animal1---");
           System.out.println(animal1.getName());
           System.out.println(animal1.getFood());
 
           System.out.println("\n--animal2---");
           System.out.println(animal2.getName());
           System.out.println(animal2.getFood());
           
    }
}