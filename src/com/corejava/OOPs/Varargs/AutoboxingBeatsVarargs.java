package com.corejava.OOPs.Varargs;

public class AutoboxingBeatsVarargs 
{
	 static void m(Integer i1, Integer i2) {
         System.out.println("Integer i1, Integer i2");
  }

  static void m(Integer...i) {
         System.out.println("int...i");
  }

  public static void main(String[] args) {
         int i = 3;
         m(i, i);
  }

}
