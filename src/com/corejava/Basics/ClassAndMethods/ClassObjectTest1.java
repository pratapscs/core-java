package com.corejava.Basics.ClassAndMethods;

class Employees {
	 
    public Employees() {} //constructor
    
    private int id;
    private String food;
 
    public int getId() {
           return id;
    }
    public void setId(int id) {
           this.id = id;
    }
    
    public String getFood() {
           return food;
    }
    public void setFood(String food) {
           this.food = food;
    }
 
}
 
 
public class ClassObjectTest1
{
    public static void main(String[] args) 
    {
           Employees emp1 = new Employees();
           emp1.setId(1);
           emp1.setFood("ankit");
 
           Employees emp2 = new Employees();
           emp2.setId(2);
           emp2.setFood("sam");
 
           System.out.println("--emp1---");
           System.out.println(emp1.getId());
           System.out.println(emp1.getFood());
 
           System.out.println("\n--emp2---");
           System.out.println(emp2.getId());
           System.out.println(emp2.getFood());
           
    }
}