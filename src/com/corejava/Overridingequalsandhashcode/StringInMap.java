package com.corejava.Overridingequalsandhashcode;

/*String, Integer, Long, Double, Float, Short and any other wrapper class should 
be preferred to use a key in HashMap in java, Reason behind using them as a key is that 
they override equals() and hashCode() method, we need not to write any explicit code 
for overriding equals() and hashCode() method.*/

import java.util.HashMap;
import java.util.Map;
 
public class StringInMap 
{
    public static void main(String...a)
    {
           
          //HashMap's key=Integer class  (Integer’s api has already overridden hashCode() and equals() method for us )
           Map<Integer, String> hm=new HashMap<Integer, String>();
           hm.put(1, "data");
           hm.put(1, "data OVERRIDDEN1");
          // hm.put(1, "data OVERRIDDEN2");
           
           System.out.println(hm.get(1));
           
           
           
           /* Integer’s API, how Integer class has overridden equals() and hashCode()
            *  method :  
            *  
            *  public int hashCode() {
            *  return value;
            *  }
            *  
            *  public boolean equals(Object obj) {
            *  if (obj instanceof Integer) {
            *  return value == ((Integer)obj).intValue();
            *  }
            *  return false;
            *  }
            * 
            */
        
           
    }
}