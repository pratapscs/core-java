package com.corejava.OOPs.Polymorphism;
/*4.can overloaded methods have different return types?
 *  yes
 *  
 *  It's not possible to have a method with same parameters and different return type. 
 *  Compiler throws error in the below case(Duplicate method).

		Method 1 : public int calc(int a, int b, int c)
		Method 2 : public String calc(int e, int f, int g)
 *  
 */
public class Poly4
{
		int add(int x,int y)
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
			Poly4 p=new Poly4();
	        System.out.println(p.add(1,1));
	     //   System.out.println(p.add(1.1,1.1));
		}
		
	}

