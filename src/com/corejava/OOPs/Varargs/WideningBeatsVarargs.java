package com.corejava.OOPs.Varargs;

public class WideningBeatsVarargs 
{
	 public static void main(String[] args) {
         int i = 3;
         m(i, i);
  }

  static void m(float f1, float f2) {
         System.out.println("float f1, float f2");
  }

  static void m(int... i) {
         System.out.println("int...i");
  }

}
