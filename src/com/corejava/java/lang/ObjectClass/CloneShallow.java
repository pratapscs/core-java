package com.corejava.java.lang.ObjectClass;

import java.util.*;

public class CloneShallow implements Cloneable 
{
 
    private String name;
    private Map<Integer, Integer> map;
    
    public CloneShallow(String name,Map<Integer,Integer> map)
    {
           this.name=name;
           this.map=map;
    }
    
    /*
     * override clone method for doing shallow copy.
     */
       @Override
    public Object clone() 
       {
           System.out.println("Doing shallow copy");
           try {
                  return super.clone();
           } catch (CloneNotSupportedException e) 
           {
                  return null;
           }
    }
 
    public static void main(String[] args) throws CloneNotSupportedException  
    {
           
           Map<Integer,Integer> map=new HashMap<Integer,Integer>();
           map.put(11, 11);
           
           CloneShallow obj=new CloneShallow("pratap",map);
           
           CloneShallow clonedObj=(CloneShallow)obj.clone();
           
           System.out.println(obj==clonedObj);             //false
           System.out.println(obj.name==clonedObj.name);   //true
           System.out.println(obj.map==clonedObj.map);     //true
           
           /*
            * In shallow copy, different object is created after cloning 
            * (i.e. clonedEmp is created from emp) but member variables keep on referring 
            * to same object (i.e. name and map).
            * 
            *                     java heap memory
            *                           
            *          emp -------->  name,map   <------- clonedObj
            *                   
            *                               
            */
           
    }
 
}