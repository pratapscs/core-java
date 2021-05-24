package com.corejava.Innerclasses;

public class LocalInnerClass
{
	/* Local inner class:
	 * 
	 * 1) LocalInnerClass can be accessed inside method in which 
	 *    it has been created.
	 *    
	 * 2) LocalInnerClass has access to all other member variables of 
	 *    OuterClass like InnerClass.
	 * 
	 * 3) LocalInnerClass can be abstract or final.
	 * 
	 * 4) LocalInnerClass can’t be static.
	 * 
	 * 5) LocalInnerClass can’t be private, protected, public.
	 * 
	 * 6) LocalInnerClass can be declared in Expressions, Statements, and 
	 *    Blocks.
	 *    
	 *    class OuterClass
	 *    {
 
    //LocalInnerClass inside instance block
    {
           class A{}
    }
    
    //LocalInnerClass inside static block
    static{
           class A{}
    }
    
    void myMethod(){
           //LocalInnerClass inside if statement
           if(true){
                  class A{}
           }
                  
           //LocalInnerClass inside for loop statement
           for(int i=0;i<1;i++){
                  class A{}
           }
    }
   
}
	 *    
	 * 7) strictfp modifier can be used with LocalInnerClass .
	 * 
	 * 8) Local Inner class cannot access the non-final local variables 
	 *    but can access final local variables.

	 * InnerClassTest1.java
	 */

}
