package com.sicemal.example.demo1.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Murrit");
		list.add("John");
		list.add("pitter");
		list.add("marek");
		list.add("mac");
		
		System.out.println("Example 1 forEach ===========");
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println("Example 2 stream.forEach ===========");
		// ForEach Expression lambda to consumer action 
		list.stream().forEach(t -> System.out.println(t));
		
		System.out.println("Example 3 stream.forEach ===========");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((key, value) -> System.out.println(key + ": " + value));
		System.out.println("Example 4 stream.forEach ===========");
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		System.out.println("Example 5 stream.forEach ===========");
		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String s1: list) {
			consumer.accept(s1);
		}
		
		System.out.println("Example 5 stream.filter(predicate)forEach ===============");
		list.stream().filter(t -> t.startsWith("m")).forEach((t) -> System.out.println(t));

		System.out.println("Example 6 map.entrySet().stream().filter ===============");
		map.entrySet().stream().filter(k -> k.getKey() % 2 ==0).forEach(obj->System.out.println(obj));

	}
}
