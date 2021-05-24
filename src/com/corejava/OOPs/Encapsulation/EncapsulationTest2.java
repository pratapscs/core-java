package com.corejava.OOPs.Encapsulation;

class Employee1
{
    String id;  //No encapsulation - field isn’t private
}
 
public class EncapsulationTest2
{
    public static void main(String[] args)
    {
           Employee1 emp=new Employee1();
           emp.id="1";  //As field isn't private, it could be accessed outside class.
           
    }
}