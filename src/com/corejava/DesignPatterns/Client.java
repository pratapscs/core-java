package com.corejava.DesignPatterns;
/* How to Create Singleton Class in Java?
 * Suppose in hibernate  SessionFactory should be singleton as its heavy weight.
 * 
 * if we are creating the object of some classes again and again ‘N’ number of 
 * times, that will definitely kills the memory and finally our application will 
 * get down, so we can avoid that with this concept.
 * 
 */

class AccountCreation  {

	private static AccountCreation instance;

    private AccountCreation(){
       //Private Constructor
    }

    public synchronized static AccountCreation getInstance()
    {
           if (instance==null)
           {
              instance = new AccountCreation();
              System.out.println("AccountCreation Class Object creatred...!!!");
           }
          else{
              System.out.println("AccountCreation Class Object not Created just returned Created one...!!!");
          }
              return instance;
       }

       public void create(int no)
       {
          System.out.println("Account Created Successfully, with Number:" +no);
       }

}

public class Client {

	  public static void main(String[] args)
	  {

		  AccountCreation tc = AccountCreation.getInstance();
		  AccountCreation tc1 = AccountCreation.getInstance();

	      tc.create(12345);
	      tc1.create(67891);
	      
	      System.out.println(tc==tc1);

	  }
	}