package com.corejava.OOPs.statickeyword;

class Employee
{
    int id;
    String name;
    static String company="XYZ pvt ltd";
    
    public Employee(int id, String name) 
    {
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
    }
    
    
}

public class StaticVariableTest
{
    public static void main(String[] args) 
    {
           Employee emp1=new Employee(1, "pratap");
           Employee emp2=new Employee(2, "tarun");
 
           System.out.println(emp1);
           System.out.println(emp2);
    }
}