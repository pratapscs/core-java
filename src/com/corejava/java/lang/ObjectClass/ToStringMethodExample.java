package com.corejava.java.lang.ObjectClass;

class Employee1{
    String name;
    String id;
   
    public Employee1() {}
   
    public Employee1(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
   
    @Override
    //Override the toString method
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
   
}
 
public class ToStringMethodExample {
 
    public static void main(String[] args) {
           
           Employee1 emp = new Employee1("ram", "1");
           
           System.out.println(emp);
    }
 
}