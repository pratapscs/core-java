package com.corejava.java.lang.ObjectClass;

import java.util.*;


public class CloneDeep implements Cloneable 
{
 
    public CloneDeep(String name,Map<Integer,Integer> map)
    {
           this.name=name;
           this.map=map;
    }
    
    private String name;
    private Map<Integer,Integer> map;
    
    /*
     * override clone method for doing deep copy.
     */
       @Override
    public CloneDeep clone(){
           System.out.println("Doing deep copy");
           
           Map<Integer,Integer> map=new HashMap<Integer,Integer>();
           Iterator<Integer> it=this.map.keySet().iterator();
           while(it.hasNext()){
                  Integer key=it.next();
                  map.put(key,this.map.get(key) );
           }
           
           CloneDeep cloneDetailedDeep=new CloneDeep(new String(name), map);
           
           return cloneDetailedDeep;
    }
 
    public static void main(String[] args) throws CloneNotSupportedException  {
 
           
           
           Map<Integer,Integer> map=new HashMap<Integer,Integer>();
           map.put(1, 11);
           
           CloneDeep obj1=new CloneDeep("chitti",map);
           
           CloneDeep obj2=(CloneDeep)obj1.clone();
           
           System.out.println(obj1==obj2);           //false
           System.out.println(obj1.name==obj2.name); //false
           System.out.println(obj1.map==obj2.map);   //false
           
           /* In deep copy, different object is created after cloning (i.e. clonedEmp is created 
            * from emp) , also member variables starts referring to different objects (i.e. 
            * name and map).
            * 
            *                           java heap memory
            *                           
            *          emp -------->  (name,map)    (name,map) <------- clonedObj
            * 
            */
                        
           
           
    }
 
}
 