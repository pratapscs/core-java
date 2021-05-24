package com.corejava.InterviewPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmailidsinaString {

	public static void main(String[] args) {
		
		String text="pratap boy goy pratap@tech.com pratap541@tech.com pra@ek.com sdjs@adjk";

		Pattern regex = Pattern.compile("[@]");

		Matcher regexMatcher = regex.matcher(text);

		int width = 0;

		while (regexMatcher.find()) {

		     if((regexMatcher.start()-10 > 0) && (regexMatcher.end()+10 < text.length())){

		       width=10;

		       String[]    substr=text.substring(regexMatcher.start()-width,regexMatcher.end()+width).split(" ");

		           for(int j=0;j<substr.length;j++){

		                   if(substr[j].contains("@") && (substr[j].contains(".com") || substr[j].contains(".net"))){

		                                System.out.println(substr[j]);

		                           }                

		                     }

		               } else {

		               width=0;

		        }

		 }
	}
}
