package com.corejava.ExceptionHandling;

public class StackTraceExample 
{
	public static void main(String[] args) {
        new StackTraceExample().method1();//method1() was called from main method.
 }

 void method1() {
        method2();//method2() was called from method1()
 }
 
 void method2() {
        method3();//method3() was called from method2()
 }
 
 void method3() {
        throw new NullPointerException();//method3() throwed exception.
 }

}
