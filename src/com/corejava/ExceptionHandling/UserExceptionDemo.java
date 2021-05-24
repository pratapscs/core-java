package com.corejava.ExceptionHandling;

@SuppressWarnings({ "serial" })

class InvalidMonthException extends Exception
{
  public String toString()
  {
    return "Invalid Month given";
  }
}
@SuppressWarnings("serial")

class InvalidDayException extends Exception
{
  public String toString()
  {
    return "Invalid Date given";
  }
}

class UserExceptionDemo
{

@SuppressWarnings("unused")

public static void main(String[] args)
  {
    try
    {
     if(args.length < 3)
       throw new NullPointerException();
     else
     {
       int dd = Integer.parseInt(args[0]);
       int mm = Integer.parseInt(args[1]);
       int yy = Integer.parseInt(args[2]);
       if(dd < 1 || dd > 31)
          throw new InvalidDayException();
       if(mm < 1 || mm > 12)
                throw new InvalidMonthException();
                  System.out.println("Valid Input");
     }
   }
   catch(Exception e)
        {
System.out.println(e);
}
 }
}