package com.corejava.OOPs.Polymorphism;
/*7.is method overloading compile time polymorphism or run time polymorphism?
 * 
 * compile time polymorphism  or static binding or Static Polymorphism
 * 
 * class has three variance of methodA or we can say methodA is polymorphic in
 * nature since it is having three different forms. In such scenario, compiler 
 * is able to figure out the method call at compile-time that’s the reason it 
 * is known as compile time polymorphism.
 */
class X
{
   void methodA(int num)
   {
       System.out.println ("methodA:" + num);
   }
   void methodA(int num1, int num2)
   {
       System.out.println ("methodA:" + num1 + "," + num2);
   }
   double methodA(double num) {
       System.out.println("methodA:" + num);
       return num;
   }
}

public class Poly7
{
   public static void main (String args [])
   {
       X Obj = new X();
       double result;
       Obj.methodA(20);
       Obj.methodA(20, 30);
       result = Obj.methodA(5.5);
       System.out.println("Answer is:" + result);
   }
}