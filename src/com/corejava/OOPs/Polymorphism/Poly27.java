package com.corejava.OOPs.Polymorphism;

/*27.if we do not specify the return type of a method,then what will be the 
 * default return type?
 * 
 * there is no default return type.
 * 
 * ex. in c ,add()            in java
 * {							add()
 * ----							{
 * ----							----
 * } <void>						}  <error>
 * 
 */
public class Poly27 
{
	int  add(int x,int y)  // error - with out return type it will show undefined type
	{
		int z;
		z=x+y;
		return z;
	}
	float add(float x,float y)
	{
		float z;
		z=x+y;
		return z;
	}
	public static void main(String[] args)
	{
		Poly27 p=new Poly27();
        System.out.println(p.add(1,1));
     //   System.out.println(p.add(1.1,1.1));
	}

}
