package com.corejava.OOPs.Encapsulation;

class Employee2
{
    Integer id;  //No encapsulation - field isn’t private
}
 
public class EncapsulationTest3
{
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
           Employee2 emp=new Employee2();
     //      emp.id="1";  //As field isn't private, it could be accessed outside 
                        //class.
           
    }
}