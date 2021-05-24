package com.corejava.Java5features;

import java.util.*;  
class ForEachExample2
{  
  public static void main(String args[])
  {  
   ArrayList<String> list=new ArrayList<String>();  
   list.add("pratap");  
   list.add("chitti");  
   list.add("viswa");  
  
   for(String s:list){  
     System.out.println(s);  
   }  
  }   
}  