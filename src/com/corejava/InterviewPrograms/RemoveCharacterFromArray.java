package com.corejava.InterviewPrograms;

//How to remove specific character from an String in Java.?

public class RemoveCharacterFromArray 
{
	public static void main(String args[])
    {
        String s = "Java Programming Language";
        String r[] = s.split("a|m");
        String res = "";
        for (String m : r) 
        {
            res = res + m;
        }
        System.out.println(res);
    }

}
