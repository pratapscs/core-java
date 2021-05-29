package com.corejava.OOPs.Array;

import java.util.Arrays;

public class PrimitiveArrayBinarySearch {
 
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
 // Its important to sort elements before doing binary 
 // search over each elements
 Arrays.sort(b);
 Arrays.sort(s);
 Arrays.sort(i);
 Arrays.sort(l);
 Arrays.sort(f);
 Arrays.sort(d);
 Arrays.sort(c);
 
 // creating valid searches below : 
 byte searchByteKey = 1;
 short searchShortKey = 4;
 int searchIntKey = 1;
 long searchLongKey = 45;
 float searchFloatKey = 6.1f;
 double searchDoubleKey = 6.4;
 char searchCharKey = 'a';
 
 System.out.println();
 System.out.println("After performing BinarySearch of valid keys : ");
 System.out.println("-----------------------------------------");
 
 int byteResult = Arrays.binarySearch(b,searchByteKey);
 System.out.println("Result of binary search of 1 is : " + byteResult);
 System.out.println("-----------------------------------------");
 
 int shortResult = Arrays.binarySearch(s,searchShortKey);
 System.out.println("Result of binary search of 4 is : " + shortResult);
 System.out.println("-----------------------------------------");
 
 int intResult = Arrays.binarySearch(i,searchIntKey);
 System.out.println("Result of binary search of 1 is : " + intResult);
 System.out.println("-----------------------------------------");
 
 int longResult = Arrays.binarySearch(l,searchLongKey);
 System.out.println("Result of binary search of 45 is : " + longResult);
 System.out.println("-----------------------------------------");
 
 int floatResult = Arrays.binarySearch(f,searchFloatKey);
 System.out.println("Result of binary search of 6.1f is : " + floatResult);
 System.out.println("-----------------------------------------");
 
 int doubleResult = Arrays.binarySearch(d,searchDoubleKey);
 System.out.println("Result of binary search of 6.4 is : " + doubleResult);
 System.out.println("-----------------------------------------");
 
 int charResult = Arrays.binarySearch(c,searchCharKey);
 System.out.println("Result of binary search of 'a' is : " + charResult);
 System.out.println("-----------------------------------------");
 
 // creating invalid search keys below : 
 searchByteKey = 20;
 searchShortKey = 40;
 searchIntKey = 25;
 searchLongKey = 62;
 searchFloatKey = 9.0f;
 searchDoubleKey = 99.0;
 searchCharKey = 'z';
 
 System.out.println();
 System.out.println("After performing BinarySearch of invalid keys : ");
 System.out.println("-----------------------------------------");
 
 byteResult = Arrays.binarySearch(b,searchByteKey);
 System.out.println("Result of binary search of 20 is : " + byteResult);
 System.out.println("-----------------------------------------");
 
 shortResult = Arrays.binarySearch(s,searchShortKey);
 System.out.println("Result of binary search of 40 is : " + shortResult);
 System.out.println("-----------------------------------------");
 
 intResult = Arrays.binarySearch(i,searchIntKey);
 System.out.println("Result of binary search of 25 is : " + intResult);
 System.out.println("-----------------------------------------");
 
 longResult = Arrays.binarySearch(l,searchLongKey);
 System.out.println("Result of binary search of 62 is : " + longResult);
 System.out.println("-----------------------------------------");
 
 floatResult = Arrays.binarySearch(f,searchFloatKey);
 System.out.println("Result of binary search of 9.0f is : " + floatResult);
 System.out.println("-----------------------------------------");
 
 doubleResult = Arrays.binarySearch(d,searchDoubleKey);
 System.out.println("Result of binary search of 99.0 is : " + doubleResult);
 System.out.println("-----------------------------------------");
 
 charResult = Arrays.binarySearch(c,searchCharKey);
 System.out.println("Result of binary search of 'z' is : " + charResult);
 System.out.println("-----------------------------------------");
 
 
 
   }
 
}