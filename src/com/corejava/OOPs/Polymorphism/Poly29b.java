package com.corejava.OOPs.Polymorphism;

/*29.what is difference between method overloading and overriding?
 * 
 * 
 */
class CarClass
{
    public int speedLimit() 
    {
        return 100;
    }
}
class Poly29b extends CarClass  //ford
{
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
    	CarClass obj = new Poly29b(); //ford
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    }
}