package com.corejava.Basics.Operators;

public class ConditionalOperatorTest 
{
    public static void main(String[] args) 
    {
           int x=4;
           int y=2;
 
           System.out.println("---------  && -----------");
           
           System.out.println((x==4) && (y==2)); //true -->> (x==4) returns true, (y==2) also returns true,
                                                                      //So,  (true && true) returns true
           System.out.println((x==7) && (y==2)); //false -->> (x==7) returns false, so (y==2) is not evaluated.
                                                                      //So,  (false && (true/false)) returns false
           System.out.println((x==4) && (y==9));  //false -->> (x==4) returns true, but (y==2) returns false.
                                                                      //So,  (true && false) returns false
 
           System.out.println("---------  || -----------");
           
           System.out.println((x==4) || (y==8));  //true -->> (x==4) returns true, so (y==8) is not evaluated.
                                                                             //So,  (true || (true/false)) returns true
           System.out.println((x==7) || (y==2));   //true -->> (x==7) returns false, (y==2) returns true
                                                                             //So,  (false || (true/false)) returns true
           System.out.println((x==9) || (y==8)); //false  -->> (x==9) returns false, (y==2) also returns false
                                                                             //So,  (false || false) returns false
    }
 
}