package com.corejava.GarbageCollection1;

public class FinalizeTest 
{
//	     @Override
//    protected void finalize() throws Throwable 
//	     {
//           try {
//                  System.out.println("in finalize() method, "
//                               + "doing cleanup activity");
//           } catch (Throwable throwable) {
//                  throw throwable;
//           }
//    }
 
	
	
    public static void main(String[] args) 
    {
           FinalizeTest obj = new FinalizeTest();
          
           try {
			obj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
//           System.out.println("in main() method");
//           try {
//                  obj.finalize(); //call finalize() method explicitly
//           } catch (Throwable throwable) 
//           {
//                  throwable.printStackTrace();
//           }  
//  
    
    System.out.println(obj.toString());
    }
 
}