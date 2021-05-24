package com.corejava.OOPs.wrapperclasses;

/* java.lang package : 
 * 
 * Everything in java is an object, except primitives. 
 * Primitives are int, short, long, boolean, etc. Since they are not objects, 
 * they cannot return as objects, and collection of objects. 
 * To support this, java provides wrapper classes.
 *  
 * Wrapper class in java provides the mechanism to 
 * convert primitive into object and object into primitive.
 * 
 * J2SE 5.0, autoboxing and unboxing feature converts primitive into 
 * object and object into primitive automatically.
 * 
 * The automatic conversion of primitive into object is known and 
 * autoboxing and vice-versa unboxing.
 * 
 * In order to represent 8 primitive data types of java there are 8
 * wrapper classes and they are
 * Byte,Integer,Short,Long,Float,Double,Charater,Boolean
 * 
 * ex:Integer int=new Integer(66);//int
 * 	  Integer int=new Integer("66");//String
 * 
 * 
 * 
 * When to use Object wrapper class?
 * ---------------------------------
 * 
 */
public class Test1 {
	
	//When to use primitive data types?

	 public static void main(String[] args) {
         
		 int i1 = 4;
         int i2 = 5;
         int i3 = i1 + i2;
         System.out.println(i3);
       
       /* Java compiler will convert above code into -
        * No conversions will be made by compiler
        * No boxing or unboxing is done.
        * No objects will be formed.
        * Performance will be very good.
        */
        
         Integer i4 = 4;
         Integer i5 = 5;
         Integer i6 = i4 + i5;
         System.out.println(i6);
         
         /*  Java compiler will convert above code into -
          *   Integer i1 = Integer.valueOf(4);
          *   Integer i2 = Integer.valueOf(5);
          *   Integer i3 = Integer.valueOf( i1.intValue() + i2.intValue() );
          *   
          *   Integer is an immutable class, so any change made to it will produce new object.
          *   
          *   3 unnecessary Integer objects were formed in heap.
          *   For forming these 3 Integer objects 3 unnecessary autoboxing operations were performed.
          *   two unnecessary unboxing operations were performed.
          *   
          *   primitive types give better performance as compared to Objects because in that case 
          *   no autoboxing/ unboxing is performed.
          */
         
  }
}
