package com.corejava.OOPs.Array;

/* 13.what are the exceptions associated with arrays?
 *   java.lang.NegativeArraySizeException 
 */
import java.util.*;
import java.io.*;

public class Array13c
{
@SuppressWarnings({ "unused", "resource" })
public static void main(String args[])throws IOException
{
int c[]=new int[-2]; // i have given the value for the size the array c[] as -2.
Scanner in=new Scanner(new InputStreamReader(System.in));
int b=in.nextInt();
int a[]=new int[b];
}
}