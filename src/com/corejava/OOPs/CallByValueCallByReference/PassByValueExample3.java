package com.corejava.OOPs.CallByValueCallByReference;

class Emp1
{
    int id;
 
    public Emp1(int id) {
           this.id = id;
    }
}
 
public class PassByValueExample3 
{
    public static void main(String[] args) 
    {
           Emp1 a=new Emp1(1); //a -> emp [id=1]
           
           System.out.println("In main(), BEFORE passing a by value i.e. BEFORE calling method m()");
           System.out.println("a.id = "+a.id);
           
           m(a); //Here a is reference to object Emp
                  // a is passed by value (i.e. copy of a is created and passed),
                  //a is not at all passed by reference,
                  //it may look like that a is passed by reference but actually that doesn't happens at all
                  //copy of a is created and that is passed to method m()
                  //a,b -> emp [id=1]
           System.out.println("\nIn main(), AFTER passing a by value i.e. AFTER calling method m()");
           System.out.println("a.id = "+a.id);
           
    }
 
    static void m(Emp1 b)  //a -> emp [id=1] , b=null
    {
           b = new Emp1(2); //Now b will start pointing to newly created object
                           //a -> emp [id=1] , b -> emp [id=2]
           System.out.println("\nIn method m(), after making some changes");
           System.out.println("b.id = " + b.id);
    }
}