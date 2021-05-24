package com.corejava.String;
/*76.what is immutable object?
 * 
 * an object whos values cant be change is reffered to as immutable object
 * 
 */
public final class String76
{

    private final String name;
    private final String mobile;

    public String76(String name, String mobile) 
    {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }
}
