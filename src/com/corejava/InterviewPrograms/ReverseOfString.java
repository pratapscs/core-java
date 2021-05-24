package com.corejava.InterviewPrograms;

public class ReverseOfString  //using for loop
{
	/* Using String method - 
	 *          
	 *          new StringBuffer(str).reverse().toString();
	 *          
	 * Iterative -
	 * 
	 * public static String getReverseString(String str){
	 *   StringBuffer strBuffer = new StringBuffer(str.length);
	 *      for(int counter=str.length -1 ; counter>=0;counter--){
	 *         strBuffer.append(str.charAt(counter));
	 * } 
	 *    return strBuffer;
	 * }
	 * 
	 * Recursive -
	 * public static String getReverseString(String str){
	 *    if(str.length <= 1){
	 *      return str;
	 * }
	 * return (getReverseString(str.subString(1)) +str.charAt(0);
	 * } 
	 */
    public static void main(String args[])
    {
        String s = "GHOWRA PRATAP";
        /*char a[] = new char[s.length()];
        int n = s.length() - 1;
        for (int i = 0; i < s.length(); i++) 
        {
            a[i] = s.charAt(n);
            n--;
        }
        String rev = new String(a);
        System.out.println(rev);*/
        
        String oup="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
        	oup=oup+s.charAt(i);
        }
        System.out.println(oup);
    }
}

