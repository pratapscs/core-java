package com.corejava.OOPs.Arrays;

import java.util.Arrays;

public class PrimitiveArraySort {
 
 public static void main(String[] args) {
 
  byte[] b = new byte [] { 3, 6, 7, 2, 1 };
  short[] s = new short[] { 9, 5, 4, 3, 2 };
  int[] i = new int[] { 34, 12, 1, 23, 78 };
  long[] l = new long[] { 100, 99, 45, 23, 1 };
  float[] f = new float[] { 3.0f, 6.1f, 7.6f, 2.5f, 1.1f };
  double[] d = new double[] { 3.6, 6.4, 7.2, 2.7, 1.8 };
  char[] c = new char[] {'e','g','s','a','c'};
 
  System.out.println("Original Arrays are as : ");
  System.out.println("-----------------------------------------");
 
  System.out.print("byte array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(b[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("short array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(s[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("int array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(i[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("long array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(l[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("float array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(f[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("double array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(d[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("char array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(c[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
 
  System.out.println();
  System.out.println();
 
  // Sorting the primitives array using Arrays.sort()
  Arrays.sort(b);
  Arrays.sort(s);
  Arrays.sort(i);
  Arrays.sort(l);
  Arrays.sort(f);
  Arrays.sort(d);
  Arrays.sort(c);
 
  System.out.println("Sorted Arrays after Arrays.sort() method : ");
 
  System.out.println("-----------------------------------------");
 
  System.out.print("byte array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(b[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("short array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(s[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("int array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(i[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("long array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(l[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("float array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(f[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("double array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(d[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("char array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(c[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
 
  System.out.println();
  System.out.println();
 
  b = new byte [] { 3, 6, 7, 2, 1 };
  s = new short[] { 9, 5, 4, 3, 2 };
  i = new int[] { 34, 12, 1, 23, 78 };
  l = new long[] { 100, 99, 45, 23, 1 };
  f = new float[] { 3.0f, 6.1f, 7.6f, 2.5f, 1.1f };
  d = new double[] { 3.6, 6.4, 7.2, 2.7, 1.8 };
  c = new char[] {'e','g','s','a','c'};
 
  Arrays.sort(b , 2 , 5);
  Arrays.sort(s , 2 , 5);
  Arrays.sort(i , 2 , 5);
  Arrays.sort(l , 2 , 5);
  Arrays.sort(f , 2 , 5);
  Arrays.sort(d , 2 , 5);
  Arrays.sort(c , 2 , 5);
 
  System.out.println("Partially sorted Arrays after \nArrays.sort(primitive[] p, int startIndex, int endIndex) method : ");
 
  System.out.println("-----------------------------------------");
 
  System.out.print("byte array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(b[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("short array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(s[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("int array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(i[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("long array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(l[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("float array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(f[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("double array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(d[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
  System.out.print("char array : [");
  for(int j = 0; j < 5; j++) {
 
   System.out.print(c[j] + " ");
 
  }
  System.out.println("]");
  System.out.println("-----------------------------------------");
 
 
  System.out.println();
  System.out.println();
 
 }
 
}