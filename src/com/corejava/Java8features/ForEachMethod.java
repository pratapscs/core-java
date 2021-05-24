package com.corejava.Java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<String> items1 = new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");
        
		System.out.println("===using normal for loop in List====");
		for(String item : items1){
			System.out.println(item);
		}
		
		 System.out.println("======using forEach() method in List=======");
		//lambda
		//Output : A,B,C,D,E
		items1.forEach(item->System.out.println(item));
		
		System.out.println("using forEach() method using condition");
		//Output : C
		items1.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		
		
		//using method reference with ::(double colon operator)
		//Output : A,B,C,D,E
		System.out.println("====using double colon operator====");
		items1.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		System.out.println("====using java.util.stream,filter====");
		items1.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
		System.out.println("=========================");
		
		Map<String,Integer>  items=new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);		
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//Normal way to loop a Map.
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
           //Java 8, you can loop a Map with forEach + lambda expression.
 
		   System.out.println("======using forEach() method in Map=======");

		   //items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));		
		
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}
	
}
