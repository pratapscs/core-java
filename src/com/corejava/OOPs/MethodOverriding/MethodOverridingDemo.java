package com.corejava.OOPs.MethodOverriding;


class A
{
    public int sum(int a,int b)
	{
      return 1;	
	}
}
public class MethodOverridingDemo extends A
{
	
 @Override
    public int sum(int a, int b) 
    
    /* method overriding through access level:
     * super class (public) - subclass(private,protected,default are not worked)
     * super class (protected) - subclass(private,default are not worked and public and protected are worked)
     * super class (default) - subclass(private are not worked and public,default,protected are worked)
     * 
     * overriding method primitive return types are same as superclass return type
     * 
     */
 {
	return 3;
 }
	
	
	public static void main(String[] args) 
{
	
}
}
