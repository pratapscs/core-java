package com.corejava.String;
/*70.In which class is the toString() present?
 * 
 * object class
 * 
 */
class String70{  //student
 int rollno;  
 String name;  
 String city;  
  
 String70(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[])
 {  
   String70 s1=new String70(101,"Raj","hyd");  
   String70 s2=new String70(102,"Vijay","bang");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
} 