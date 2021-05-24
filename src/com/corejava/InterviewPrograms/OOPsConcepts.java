package com.corejava.InterviewPrograms;

class A2 
{
	  public void display() 
	  {
	    System.out.println("I am A2");
	  }
	}
	class B2 extends A2 { //B2 is a subclass of A2
	  //Override
	  public void display()
	  {
	    System.out.println("I am B2");
	  }
	  public int add(int x, int y) {
	    return x+y;
	  }
	  //Overload
	  public double add(double x,double y) {
	    return x+y;
	  }
	}
	class OOPsConcepts
	{
	  public static void main(String args[])
	  {
	    A2 a=new A2();
	    a.display(); //Displays "I am A"
	    B2 b=new B2();
	    b.display(); //Displays "I am B"
	    System.out.println(b.add(5,2)); //displays 7
	    System.out.println(b.add(5.,2.)); //adhoc polymorphism, displays "7.0"
	    a=b; //a acts as a reference to the object b
	    a.display(); //dynamic polymorphism or dynamic method dispatch, displays "I am B"
	   }
}
