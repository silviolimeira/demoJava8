package com.sicemal.example.demo1.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		// Sorting using anonymous function comparator
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		System.out.println("Sorting using anonymous function comparator: ");
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
		//Sorting using lambda expression
		map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);		

		entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));	
	
		System.out.println("Sorting using lambda expression: ");
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		// Sorting using stream
		System.out.println("Sorting using stream comparingByKey: ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("Sorting using stream comparingByValue: ");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
	
}
