package com.corejava.InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 1.create arraylist and a elemets to the arraylist
 * 2.pass the arraylist to Collections.swap method which
 *   takes indexes and collection.
 */
public class SwapArrayListElements {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Before swapping elements ="+ list);
		
		Collections.swap(list, 1, 2);
		
		System.out.println("After swapping elements ="+ list);
	}
}
