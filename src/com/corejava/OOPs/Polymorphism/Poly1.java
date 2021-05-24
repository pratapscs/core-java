package com.corejava.OOPs.Polymorphism;

/*1.which object oriented concept is achieved using overloading?
 * virtual polymorphism
 */
class Employee 
{
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		super();
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to"+this.name+" "+this.address);
	}
    public String toString()
    {
    	return name+" "+ address+" "+number;
    }

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress)
			{
		address=newAddress;
			}

	public int getNumber() {
		return number;
	}
    
}
public class Poly1 {

		   public static void main(String [] args) {
		      Salary s = new Salary("pratap", "bang", 3,3600.00);
		      Employee e = new Salary("viswa", "hyd", 2,5400.00);
		      System.out.println("Call mailCheck using Salary reference --");   
		      s.mailCheck();
		      System.out.println("\n Call mailCheck using Employee reference--");
		      e.mailCheck();
		   }
	}



