package com.corejava.OOPs.CallByValueCallByReference;

/* Call by value (Pass by value) - reference to object is passed by copy in java.
 * Reference to object is passed by value (i.e. copy of reference is created
 * and passed), reference to object is not at all passed by reference in java.
 */

class Emp
{
int id;

public Emp(int id) 
{
       this.id = id;
}
}

public class PassByValueExample2 
{
public static void main(String[] args) 
{
       Emp a=new Emp(1); //a -> emp [id=1]
       
       System.out.println("In main(), BEFORE passing a by value i.e. BEFORE calling method m()");
       System.out.println("a.id = "+a.id);
       
       m(a); //Here a is reference to object Emp
             //a is passed by value (i.e. copy of a is created and passed),
             //a is not at all passed by reference,
             //it may look like that a is passed by reference but actually that doesn't happens at all
             //copy of a is created and that is passed to method m()
             //a,b -> emp [id=1]

       System.out.println("\nIn main(), AFTER passing a by value i.e. AFTER calling method m()");
       System.out.println("a.id = "+a.id);
       
}

static void m(Emp b)   //a -> emp [id=1] , b=null
{
       b.id = 2; //a,b -> emp [id=2]
       System.out.println("\nIn method m(), after making some changes");
       System.out.println("b.id = " + b.id);
}
}