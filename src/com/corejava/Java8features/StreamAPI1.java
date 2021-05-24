package com.corejava.Java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("lokesh", "amar", "pratap");
		
		List<String> result = getFilterOutput(lines, "pratap");
        
		for (String temp : result) {
            System.out.println(temp);    //output : lokesh, amar
        }

    }

	private static List<String> getFilterOutput(List<String> lines,String filter) {
		List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"pratap".equals(line)) { // we don't like pratap
                result.add(line);
            }
        }
		return result;
	}

	}
