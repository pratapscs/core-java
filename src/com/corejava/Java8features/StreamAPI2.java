package com.corejava.Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI2 {

	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("lokesh", "amar", "pratap");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"pratap".equals(line))     // we dont like pratap
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : lokesh, amar

    }

	}
