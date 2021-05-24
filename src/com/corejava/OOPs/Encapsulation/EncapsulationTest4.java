package com.corejava.OOPs.Encapsulation;

class Employee3
{
    Integer id;
 
    public String getId() {
           return String.valueOf(id);
    }
 
    public void setId(String id) {
           this.id = Integer.parseInt(id);
    }
    
}
public class EncapsulationTest4 
{
    public static void main(String[] args) 
    {
           Employee3 emp=new Employee3();
           emp.setId("1");
           System.out.println("emp.getId()  >  "+emp.getId());
           
    }
}