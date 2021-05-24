package com.corejava.OOPs.Polymorphism;

/* Polymorphism is the ability of an object to take on many forms. 
 * 
 * The most common use of polymorphism in OOP occurs when a parent 
 * class reference 
 * 
 * is used to refer to a child class object.
 */

public class Salary extends Employee
{
	private double salary; //annual salary
	
	public Salary(String name, String address, int number,double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck()
	{
		System.out.println("with in mail check of salary class");
		System.out.println("mailing check to "+getName()+" with salary"+ salary );
	}
	public double getSalary()
	{
		return salary;
	}
    private void setSalary(double newSalary)
    {
    	if(newSalary >= 0.0)
    	{
    		salary=newSalary;
    	}
	}
    public double computePay()
    {
    	System.out.println("Computing salary pay for " + getName());
        
    	return salary/52;
    }

}
