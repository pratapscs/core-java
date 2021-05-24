package com.corejava.java.lang.ObjectClass;

class Employee
{
    String name;
    String id;
   
    public Employee() {}
   
    public Employee(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }
   
    //Don't Override the toString method
   
}
 
public class WithoutToStringMethodImplementation 
{
 
    public static void main(String[] args) 
    {
           
           Employee emp = new Employee("ram", "1");
           
           System.out.println(emp);
    }
 
}