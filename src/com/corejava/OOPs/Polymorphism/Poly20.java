package com.corejava.OOPs.Polymorphism;
/*20.where are the reference variables and local variables created in java?
 * 
 * in the activation record
 * 
 */
class Student 
{

	  int age;         // value stored on heap within instance of Student
	  String name;     // reference stored on heap within instance of Student

	  public Student() {
	    this.age = 0;
	    name = "Anonymous";
	  }

	  public Student(int Age, String Name) {
	    this.age = Age;
	    setName(Name);
	  }

	  public void setName(String Name) {
	    this.name = Name;
	  }

	}

public class Poly20 
{
	 @SuppressWarnings("unused")
	public static void main(String[] args) 
	 {
	        Student s;                    // reference reserved on stack
	        s = new Student(23, "John");  // reference stored on stack, object allocated on heap
	        int noStudents = 1;           // value stored on stack
	  }

}
