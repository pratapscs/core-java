package com.corejava.RegularExpressions;

public class EitherOrCheck {

	public static void main(String[] args) {
		 
        String s = "The film Tom and Jerry!";
  
        // Check the whole s
        // Begin by any characters appear 0 or more times
        // Next Tom or Jerry
        // End with any characters appear 0 or more times
        // Combine the rules:., *, X | Z
        // ==> true        
        boolean match = s.matches(".*(Tom|Jerry).*");
        System.out.println("s=" + s);
        System.out.println("-Match .*(Tom|Jerry).* " + match);
 
        s = "The cat";
        // ==> false
        match = s.matches(".*(Tom|Jerry).*");
        System.out.println("s=" + s);
        System.out.println("-Match .*(Tom|Jerry).* " + match);
 
        s = "The Tom cat";
        // ==> true
        match = s.matches(".*(Tom|Jerry).*");
        System.out.println("s=" + s);
        System.out.println("-Match .*(Tom|Jerry).* " + match);
    }
 
}
