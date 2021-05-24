package com.corejava.String;
/*57.what is the role of toString()?
 * 
 * If you want to represent any object as a string, toString() method 
 * comes into existence.
 * 
 * toString() method returns the string representation of the object.
 * 
 * 
 */
class String57{  //student
	 int rollno;  
	 String name;  
	 String city;  
	  
	 String57(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
		 String57 s1=new String57(101,"Raj","lucknow");  
		 String57 s2=new String57(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  