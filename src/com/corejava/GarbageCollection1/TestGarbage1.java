package com.corejava.GarbageCollection1;

public class TestGarbage1
{  
	 public void finalize()
	 {
		 System.out.println("object is garbage collected");
	}  
	 @SuppressWarnings("unused")
	public static void main(String args[]){  
	  TestGarbage1 s1=new TestGarbage1();  
	  TestGarbage1 s2=new TestGarbage1();  
	  TestGarbage1 s3=new TestGarbage1();
//	  s1=null;  
//	  s2=null; 
//	  s3=null;
//	  System.out.println(s1.hashCode());
//	  System.out.println(s2.hashCode());
	  System.gc();  
	 }  
	}  